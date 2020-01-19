# Generated from MyLang.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyLangParser import MyLangParser
else:
    from MyLangParser import MyLangParser

# This class defines a complete listener for a parse tree produced by MyLangParser.
class MyLangListener(ParseTreeListener):

    # Enter a parse tree produced by MyLangParser#main.
    def enterMain(self, ctx:MyLangParser.MainContext):
        pass

    # Exit a parse tree produced by MyLangParser#main.
    def exitMain(self, ctx:MyLangParser.MainContext):
        pass


    # Enter a parse tree produced by MyLangParser#code.
    def enterCode(self, ctx:MyLangParser.CodeContext):
        pass

    # Exit a parse tree produced by MyLangParser#code.
    def exitCode(self, ctx:MyLangParser.CodeContext):
        pass


    # Enter a parse tree produced by MyLangParser#global_statement.
    def enterGlobal_statement(self, ctx:MyLangParser.Global_statementContext):
        pass

    # Exit a parse tree produced by MyLangParser#global_statement.
    def exitGlobal_statement(self, ctx:MyLangParser.Global_statementContext):
        pass


    # Enter a parse tree produced by MyLangParser#var_decl.
    def enterVar_decl(self, ctx:MyLangParser.Var_declContext):
        pass

    # Exit a parse tree produced by MyLangParser#var_decl.
    def exitVar_decl(self, ctx:MyLangParser.Var_declContext):
        pass


    # Enter a parse tree produced by MyLangParser#var_def.
    def enterVar_def(self, ctx:MyLangParser.Var_defContext):
        pass

    # Exit a parse tree produced by MyLangParser#var_def.
    def exitVar_def(self, ctx:MyLangParser.Var_defContext):
        pass


    # Enter a parse tree produced by MyLangParser#function.
    def enterFunction(self, ctx:MyLangParser.FunctionContext):
        pass

    # Exit a parse tree produced by MyLangParser#function.
    def exitFunction(self, ctx:MyLangParser.FunctionContext):
        pass


    # Enter a parse tree produced by MyLangParser#function_args.
    def enterFunction_args(self, ctx:MyLangParser.Function_argsContext):
        pass

    # Exit a parse tree produced by MyLangParser#function_args.
    def exitFunction_args(self, ctx:MyLangParser.Function_argsContext):
        pass


    # Enter a parse tree produced by MyLangParser#function_args_.
    def enterFunction_args_(self, ctx:MyLangParser.Function_args_Context):
        pass

    # Exit a parse tree produced by MyLangParser#function_args_.
    def exitFunction_args_(self, ctx:MyLangParser.Function_args_Context):
        pass


    # Enter a parse tree produced by MyLangParser#body.
    def enterBody(self, ctx:MyLangParser.BodyContext):
        pass

    # Exit a parse tree produced by MyLangParser#body.
    def exitBody(self, ctx:MyLangParser.BodyContext):
        pass


    # Enter a parse tree produced by MyLangParser#local_statement.
    def enterLocal_statement(self, ctx:MyLangParser.Local_statementContext):
        pass

    # Exit a parse tree produced by MyLangParser#local_statement.
    def exitLocal_statement(self, ctx:MyLangParser.Local_statementContext):
        pass


    # Enter a parse tree produced by MyLangParser#function_call.
    def enterFunction_call(self, ctx:MyLangParser.Function_callContext):
        pass

    # Exit a parse tree produced by MyLangParser#function_call.
    def exitFunction_call(self, ctx:MyLangParser.Function_callContext):
        pass


    # Enter a parse tree produced by MyLangParser#exp_list.
    def enterExp_list(self, ctx:MyLangParser.Exp_listContext):
        pass

    # Exit a parse tree produced by MyLangParser#exp_list.
    def exitExp_list(self, ctx:MyLangParser.Exp_listContext):
        pass


    # Enter a parse tree produced by MyLangParser#exp_list_.
    def enterExp_list_(self, ctx:MyLangParser.Exp_list_Context):
        pass

    # Exit a parse tree produced by MyLangParser#exp_list_.
    def exitExp_list_(self, ctx:MyLangParser.Exp_list_Context):
        pass


    # Enter a parse tree produced by MyLangParser#cycle.
    def enterCycle(self, ctx:MyLangParser.CycleContext):
        pass

    # Exit a parse tree produced by MyLangParser#cycle.
    def exitCycle(self, ctx:MyLangParser.CycleContext):
        pass


    # Enter a parse tree produced by MyLangParser#for_statement.
    def enterFor_statement(self, ctx:MyLangParser.For_statementContext):
        pass

    # Exit a parse tree produced by MyLangParser#for_statement.
    def exitFor_statement(self, ctx:MyLangParser.For_statementContext):
        pass


    # Enter a parse tree produced by MyLangParser#while_statement.
    def enterWhile_statement(self, ctx:MyLangParser.While_statementContext):
        pass

    # Exit a parse tree produced by MyLangParser#while_statement.
    def exitWhile_statement(self, ctx:MyLangParser.While_statementContext):
        pass


    # Enter a parse tree produced by MyLangParser#if_statement.
    def enterIf_statement(self, ctx:MyLangParser.If_statementContext):
        pass

    # Exit a parse tree produced by MyLangParser#if_statement.
    def exitIf_statement(self, ctx:MyLangParser.If_statementContext):
        pass


    # Enter a parse tree produced by MyLangParser#type_.
    def enterType_(self, ctx:MyLangParser.Type_Context):
        pass

    # Exit a parse tree produced by MyLangParser#type_.
    def exitType_(self, ctx:MyLangParser.Type_Context):
        pass


    # Enter a parse tree produced by MyLangParser#array_type.
    def enterArray_type(self, ctx:MyLangParser.Array_typeContext):
        pass

    # Exit a parse tree produced by MyLangParser#array_type.
    def exitArray_type(self, ctx:MyLangParser.Array_typeContext):
        pass


    # Enter a parse tree produced by MyLangParser#basic_type.
    def enterBasic_type(self, ctx:MyLangParser.Basic_typeContext):
        pass

    # Exit a parse tree produced by MyLangParser#basic_type.
    def exitBasic_type(self, ctx:MyLangParser.Basic_typeContext):
        pass


    # Enter a parse tree produced by MyLangParser#returned_type.
    def enterReturned_type(self, ctx:MyLangParser.Returned_typeContext):
        pass

    # Exit a parse tree produced by MyLangParser#returned_type.
    def exitReturned_type(self, ctx:MyLangParser.Returned_typeContext):
        pass


    # Enter a parse tree produced by MyLangParser#assigment_statement.
    def enterAssigment_statement(self, ctx:MyLangParser.Assigment_statementContext):
        pass

    # Exit a parse tree produced by MyLangParser#assigment_statement.
    def exitAssigment_statement(self, ctx:MyLangParser.Assigment_statementContext):
        pass


    # Enter a parse tree produced by MyLangParser#atom.
    def enterAtom(self, ctx:MyLangParser.AtomContext):
        pass

    # Exit a parse tree produced by MyLangParser#atom.
    def exitAtom(self, ctx:MyLangParser.AtomContext):
        pass


    # Enter a parse tree produced by MyLangParser#exp.
    def enterExp(self, ctx:MyLangParser.ExpContext):
        pass

    # Exit a parse tree produced by MyLangParser#exp.
    def exitExp(self, ctx:MyLangParser.ExpContext):
        pass


    # Enter a parse tree produced by MyLangParser#p0.
    def enterP0(self, ctx:MyLangParser.P0Context):
        pass

    # Exit a parse tree produced by MyLangParser#p0.
    def exitP0(self, ctx:MyLangParser.P0Context):
        pass


    # Enter a parse tree produced by MyLangParser#p6.
    def enterP6(self, ctx:MyLangParser.P6Context):
        pass

    # Exit a parse tree produced by MyLangParser#p6.
    def exitP6(self, ctx:MyLangParser.P6Context):
        pass


