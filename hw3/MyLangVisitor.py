# Generated from MyLang.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyLangParser import MyLangParser
else:
    from MyLangParser import MyLangParser

# This class defines a complete generic visitor for a parse tree produced by MyLangParser.

class MyLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyLangParser#main.
    def visitMain(self, ctx:MyLangParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#code.
    def visitCode(self, ctx:MyLangParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#global_statement.
    def visitGlobal_statement(self, ctx:MyLangParser.Global_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#var_decl.
    def visitVar_decl(self, ctx:MyLangParser.Var_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#var_def.
    def visitVar_def(self, ctx:MyLangParser.Var_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#function.
    def visitFunction(self, ctx:MyLangParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#function_args.
    def visitFunction_args(self, ctx:MyLangParser.Function_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#function_args_.
    def visitFunction_args_(self, ctx:MyLangParser.Function_args_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#body.
    def visitBody(self, ctx:MyLangParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#local_statement.
    def visitLocal_statement(self, ctx:MyLangParser.Local_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#returned.
    def visitReturned(self, ctx:MyLangParser.ReturnedContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#function_call.
    def visitFunction_call(self, ctx:MyLangParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exp_list.
    def visitExp_list(self, ctx:MyLangParser.Exp_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exp_list_.
    def visitExp_list_(self, ctx:MyLangParser.Exp_list_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#cycle.
    def visitCycle(self, ctx:MyLangParser.CycleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#for_statement.
    def visitFor_statement(self, ctx:MyLangParser.For_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#while_statement.
    def visitWhile_statement(self, ctx:MyLangParser.While_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#if_statement.
    def visitIf_statement(self, ctx:MyLangParser.If_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#type_.
    def visitType_(self, ctx:MyLangParser.Type_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#array_type.
    def visitArray_type(self, ctx:MyLangParser.Array_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#basic_type.
    def visitBasic_type(self, ctx:MyLangParser.Basic_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#returned_type.
    def visitReturned_type(self, ctx:MyLangParser.Returned_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#assigment_statement.
    def visitAssigment_statement(self, ctx:MyLangParser.Assigment_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#atom.
    def visitAtom(self, ctx:MyLangParser.AtomContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#exp.
    def visitExp(self, ctx:MyLangParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#p.
    def visitP(self, ctx:MyLangParser.PContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#q.
    def visitQ(self, ctx:MyLangParser.QContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#read_.
    def visitRead_(self, ctx:MyLangParser.Read_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#write_.
    def visitWrite_(self, ctx:MyLangParser.Write_Context):
        return self.visitChildren(ctx)



del MyLangParser