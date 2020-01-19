
# Generated from MyLang.g4 by ANTLR 4.7.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MyLangParser import MyLangParser
else:
    from MyLangParser import MyLangParser

MAPPER = {
    'true' : 1,
    'false': 0,
    'string': 'char*',
    'bool': 'int',
    'mod': '%',
    'or' : '||',
    'and': '&&',
    'not': '!',
    ':=': '=',

}
# This class defines a complete generic visitor for a parse tree produced by MyLangParser.

class MyLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyLangParser#main.
    def visitMain(self, ctx:MyLangParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#code.
    def visitCode(self, ctx:MyLangParser.CodeContext):
        if len(ctx.children) == 1:
            return ''
        else:
            return '{}\n{}'.format(
                self.visitGlobal_statement(ctx.chilrden[0]),
                self.visitCode(ctx.children[1]), 
                )


    # Visit a parse tree produced by MyLangParser#global_statement.
    def visitGlobal_statement(self, ctx:MyLangParser.Global_statementContext):
        children = ctx.children
        if type(children[0]) == MyLangParser.Var_declContext:
            return '{};\n'.format(self.visitVar_decl(children[0]))
        elif type(children[0]) == MyLangParser.Var_declContext:
            return '{};\n'.format(self.visitVar_def(children[0]))
        elif type(children[0]) == MyLangParser.FunctionContext:
            return '{}\n'.format(self.visitFunction(children[0]))
        else:
            return '{}\n'.format(self.visitFunction_call(children[0]))


        
        
        


    # Visit a parse tree produced by MyLangParser#var_decl.
    def visitVar_decl(self, ctx:MyLangParser.Var_declContext):
        return '{} {}'.format(
            self.visitType_(ctx.children[1]),
            ctx.children[0].text
        )


    # Visit a parse tree produced by MyLangParser#var_def.
    def visitVar_def(self, ctx:MyLangParser.Var_defContext):
        return '{} {} = '.format(
            self.visitType_(ctx.children[1]),
            ctx.children[0].text,
            self.visitExp(ctx.children[4]),
        )



    # Visit a parse tree produced by MyLangParser#function.
    def visitFunction(self, ctx:MyLangParser.FunctionContext):
        return '{} {} ({}) \{\n{}\}\n'.format(
           self.visitReturned_type(ctx.children[6]),
           ctx.children[0].text,
           self.visitFunction_args_(ctx.children[3]),
           self.visitBody(ctx.children[8]),
        )


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


    # Visit a parse tree produced by MyLangParser#p0.
    def visitP0(self, ctx:MyLangParser.P0Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyLangParser#p6.
    def visitP6(self, ctx:MyLangParser.P6Context):
        return self.visitChildren(ctx)



del MyLangParser