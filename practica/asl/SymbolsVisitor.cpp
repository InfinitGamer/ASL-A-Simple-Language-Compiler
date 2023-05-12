//////////////////////////////////////////////////////////////////////
//
//    SymbolsVisitor - Walk the parser tree to register symbols
//                     for the Asl programming language
//
//    Copyright (C) 2017-2023  Universitat Politecnica de Catalunya
//
//    This library is free software; you can redistribute it and/or
//    modify it under the terms of the GNU General Public License
//    as published by the Free Software Foundation; either version 3
//    of the License, or (at your option) any later version.
//
//    This library is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Affero General Public License for more details.
//
//    You should have received a copy of the GNU Affero General Public
//    License along with this library; if not, write to the Free Software
//    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//
//    contact: José Miguel Rivero (rivero@cs.upc.edu)
//             Computer Science Department
//             Universitat Politecnica de Catalunya
//             despatx Omega.110 - Campus Nord UPC
//             08034 Barcelona.  SPAIN
//
//////////////////////////////////////////////////////////////////////

#include "SymbolsVisitor.h"
#include "antlr4-runtime.h"

#include "../common/TypesMgr.h"
#include "../common/SymTable.h"
#include "../common/TreeDecoration.h"
#include "../common/SemErrors.h"

#include <iostream>
#include <string>
#include <vector>

#include <cstddef> // std::size_t

// uncomment the following line to enable debugging messages with DEBUG*
// #define DEBUG_BUILD
#include "../common/debug.h"

// using namespace std;

// Constructor
SymbolsVisitor::SymbolsVisitor(TypesMgr &Types,
                               SymTable &Symbols,
                               TreeDecoration &Decorations,
                               SemErrors &Errors) : Types{Types},
                                                    Symbols{Symbols},
                                                    Decorations{Decorations},
                                                    Errors{Errors}
{
}

// Methods to visit each kind of node:
//
antlrcpp::Any SymbolsVisitor::visitProgram(AslParser::ProgramContext *ctx)
{
  DEBUG_ENTER();
  SymTable::ScopeId sc = Symbols.pushNewScope(SymTable::GLOBAL_SCOPE_NAME);
  putScopeDecor(ctx, sc);
  for (auto ctxFunc : ctx->function())
  {
    visit(ctxFunc);
  }
  // Symbols.print();
  Symbols.popScope();
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any SymbolsVisitor::visitFunction(AslParser::FunctionContext *ctx)
{
  DEBUG_ENTER();
  std::string funcName = ctx->ID()->getText();
  SymTable::ScopeId sc = Symbols.pushNewScope(funcName);
  putScopeDecor(ctx, sc);
  std::vector<TypesMgr::TypeId> lParamsTy;
  for (auto var : ctx->param())
  {
    visit(var);
    lParamsTy.push_back(getTypeDecor(var->type()));
  }
  visit(ctx->declarations());
  // Symbols.print();
  Symbols.popScope();
  std::string ident = ctx->ID()->getText();
  if (Symbols.findInCurrentScope(ident))
  {
    Errors.declaredIdent(ctx->ID());
  }
  else
  {
    TypesMgr::TypeId tRet = Types.createVoidTy();
    if (ctx->basic_type)
    {
      visit(ctx->basic_type);
      tRet = getTypeDecor(ctx->basic_type);
    }
    TypesMgr::TypeId tFunc = Types.createFunctionTy(lParamsTy, tRet);
    Symbols.addFunction(ident, tFunc);
  }
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any SymbolsVisitor::visitDeclarations(AslParser::DeclarationsContext *ctx)
{
  DEBUG_ENTER();
  visitChildren(ctx);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any SymbolsVisitor::visitVariable_decl(AslParser::Variable_declContext *ctx)
{
  DEBUG_ENTER();
  visit(ctx->type());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->type());
  for (auto token : ctx->ID())
  {
    std::string ident = token->getText();
    if (Symbols.findInCurrentScope(ident))
    {
      Errors.declaredIdent(token);
    }
    else
    {
      Symbols.addLocalVar(ident, t1);
    }
  }
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any SymbolsVisitor::visitParam(AslParser::ParamContext *ctx)
{
  DEBUG_ENTER();
  visit(ctx->type());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->type());
  std::string ident = ctx->ID()->getText();
  if (Symbols.findInCurrentScope(ident))
  {
    Errors.declaredIdent(ctx->ID());
  }
  else
  {
    Symbols.addParameter(ident, t1);
  }

  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any SymbolsVisitor::visitBasicType(AslParser::BasicTypeContext *ctx)
{
  DEBUG_ENTER();
  visit(ctx->basic());
  TypesMgr::TypeId t = getTypeDecor(ctx->basic());
  putTypeDecor(ctx, t);
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any SymbolsVisitor::visitBasic(AslParser::BasicContext *ctx)
{
  DEBUG_ENTER();
  TypesMgr::TypeId t = Types.createErrorTy();
  if (ctx->BASIC_TYPE()->getText() == "int")
  {
    t = Types.createIntegerTy();
  }
  else if (ctx->BASIC_TYPE()->getText() == "bool")
  {
    t = Types.createBooleanTy();
  }
  else if (ctx->BASIC_TYPE()->getText() == "char")
  {
    t = Types.createCharacterTy();
  }
  else if (ctx->BASIC_TYPE()->getText() == "float")
  {
    t = Types.createFloatTy();
  }
  putTypeDecor(ctx, t);
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any SymbolsVisitor::visitArrayType(AslParser::ArrayTypeContext *ctx)
{
  DEBUG_ENTER();
  std::string tempStr = ctx->INTVAL()->getText();
  int size = stoi(tempStr);
  visit(ctx->basic());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->basic());
  TypesMgr::TypeId t = Types.createErrorTy();
  if (not Types.isErrorTy(t1))
  {
    t = Types.createArrayTy(size, t1);
  }
  putTypeDecor(ctx, t);
  DEBUG_EXIT();
  return 0;
}

// antlrcpp::Any SymbolsVisitor::visitStatements(AslParser::StatementsContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitAssignStmt(AslParser::AssignStmtContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitIfStmt(AslParser::IfStmtContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitProcCall(AslParser::ProcCallContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitReadStmt(AslParser::ReadStmtContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitWriteExpr(AslParser::WriteExprContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitWriteString(AslParser::WriteStringContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitLeft_expr(AslParser::Left_exprContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitExprIdent(AslParser::ExprIdentContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitArithmetic(AslParser::ArithmeticContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitRelational(AslParser::RelationalContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitValue(AslParser::ValueContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any SymbolsVisitor::visitIdent(AslParser::IdentContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// Getters for the necessary tree node atributes:
//   Scope and Type
SymTable::ScopeId SymbolsVisitor::getScopeDecor(antlr4::ParserRuleContext *ctx)
{
  return Decorations.getScope(ctx);
}
TypesMgr::TypeId SymbolsVisitor::getTypeDecor(antlr4::ParserRuleContext *ctx)
{
  return Decorations.getType(ctx);
}

// Setters for the necessary tree node attributes:
//   Scope and Type
void SymbolsVisitor::putScopeDecor(antlr4::ParserRuleContext *ctx, SymTable::ScopeId s)
{
  Decorations.putScope(ctx, s);
}
void SymbolsVisitor::putTypeDecor(antlr4::ParserRuleContext *ctx, TypesMgr::TypeId t)
{
  Decorations.putType(ctx, t);
}
