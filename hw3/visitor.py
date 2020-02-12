from hw3.MyLangVisitor import *
from hw3.MyLangParser import *

TYPE_MAPPER = {
    'Int': 'int',
    'Double': 'double',
    'String': 'char*',
    'Char': 'char',
    'Boolean': 'char',
    'Long': 'long',
}

OPERATION_MAPPER = {
    'mod': '%',
    'or': '||',
    'and': '&&',
    'not': '!',
}

IO_MAPPER = {
    'int': '%d',
    'long': '%li',
    'double': '%lf',
    'float': '%f',
    'char': '%c',
    'char*': '%c',
}


class Visitor(MyLangVisitor):
    def tabs(self):
        return ' ' * (self.intend * 4)

    def __init__(self):
        self.out = []
        self.intend = 0

    def visitMain(self, ctx: MyLangParser.MainContext):
        code = self.visit(ctx.code())
        return '#include <stdio.h>\n' + code
        # Visit a parse tree produced by MyLangParser#code.

    def visitCode(self, ctx: MyLangParser.CodeContext):
        if ctx.children:
            gs = self.visit(ctx.global_statement())
            return gs + '\n' + self.visit(ctx.code())
        else:
            return ""

        # Visit a parse tree produced by MyLangParser#global_statement.

    def visitGlobal_statement(self, ctx: MyLangParser.Global_statementContext):
        return self.visitChildren(ctx)

        # Visit a parse tree produced by MyLangParser#var_decl.

    def visitVar_decl(self, ctx: MyLangParser.Var_declContext):
        id = ctx.ID().__str__()
        type_, arr_type = self.visit(ctx.type_())
        return type_ + ' ' + id + arr_type

        # Visit a parse tree produced by MyLangParser#var_def.

    def visitVar_def(self, ctx: MyLangParser.Var_defContext):
        id = ctx.ID().__str__()
        type_, arr_type = self.visit(ctx.type_())
        exp = self.visit(ctx.exp())
        return type_ + ' ' + id + arr_type + ' = ' + exp
        # Visit a parse tree produced by MyLangParser#function.

    def visitFunction(self, ctx: MyLangParser.FunctionContext):
        id = ctx.ID().__str__()
        func_args = self.visit(ctx.function_args())
        r_type = self.visit(ctx.returned_type())
        self.intend += 1
        body = self.visit(ctx.body())
        self.intend -= 1
        return r_type + ' ' + id + '(' + func_args + ')' + ' ' + '{' + '\n' \
               + body + '\n' \
               + self.tabs() + '}' + '\n'

        # Visit a parse tree produced by MyLangParser#function_args.

    def visitFunction_args(self, ctx: MyLangParser.Function_argsContext):
        if ctx.children:
            id = ctx.ID().__str__()
            type_, arr_type = self.visit(ctx.type_())
            function_args_ = self.visit(ctx.function_args_())
            return type_ + ' ' + id + arr_type + function_args_
        else:
            return ''
        # Visit a parse tree produced by MyLangParser#function_args_.

    def visitFunction_args_(self, ctx: MyLangParser.Function_args_Context):
        if ctx.children:
            id = ctx.ID().__str__()
            type_, arr_type = self.visit(ctx.type_())
            function_args_ = self.visit(ctx.function_args_())
            return ', ' + type_ + ' ' + id + arr_type + function_args_
        else:
            return ''

        # Visit a parse tree produced by MyLangParser#body.

    def visitBody(self, ctx: MyLangParser.BodyContext):
        if ctx.children:
            ls = self.visit(ctx.local_statement())
            body = self.visit(ctx.body())
            return ls + '\n' + body
        else:
            return ''
        # Visit a parse tree produced by MyLangParser#local_statement.

    def visitLocal_statement(self, ctx: MyLangParser.Local_statementContext):
        ls = self.visit(ctx.children[0])
        if ctx.var_def() or ctx.var_decl() or ctx.exp() or ctx.returned() or ctx.read_() or ctx.write_():
            return self.tabs() + ls + ';'
        else:
            return ls

        # Visit a parse tree produced by MyLangParser#function_call.

    def visitReturned(self, ctx: MyLangParser.ReturnedContext):
        if ctx.exp():
            exp = self.visit(ctx.exp())
            return 'return ' + exp
        else:
            return + 'return'

    def visitFunction_call(self, ctx: MyLangParser.Function_callContext):
        id = ctx.ID().__str__()
        exp_list = self.visit(ctx.exp_list())
        return id + '(' + exp_list + ')'
        # Visit a parse tree produced by MyLangParser#exp_list.

    def visitExp_list(self, ctx: MyLangParser.Exp_listContext):
        if ctx.children:
            exp = self.visit(ctx.exp())
            exp_ = self.visit(ctx.exp_list_())
            return exp + exp_
        else:
            return ''
        # Visit a parse tree produced by MyLangParser#exp_list_.

    def visitExp_list_(self, ctx: MyLangParser.Exp_list_Context):
        if ctx.children:
            exp = self.visit(ctx.exp())
            exp_ = self.visit(ctx.exp_list_())
            return ', ' + exp + exp_
        else:
            return ''
        # Visit a parse tree produced by MyLangParser#cycle.

    def visitCycle(self, ctx: MyLangParser.CycleContext):
        return self.visitChildren(ctx)

        # Visit a parse tree produced by MyLangParser#for_statement.

    def visitFor_statement(self, ctx: MyLangParser.For_statementContext):
        var_def = self.visit(ctx.var_def())
        exp0 = self.visit(ctx.exp(0))
        exp1 = self.visit(ctx.exp(1))
        self.intend += 1
        body = self.visit(ctx.body())
        self.intend -= 1
        return self.tabs() + 'for ' + '(' + var_def + '; ' + exp0 + '; ' + exp1 + ') {' + '\n' \
               + body + '\n' \
               + self.tabs() + '}'

        # Visit a parse tree produced by MyLangParser#while_statement.

    def visitWhile_statement(self, ctx: MyLangParser.While_statementContext):
        exp = self.visit(ctx.exp())
        self.intend += 1
        body = self.visit(ctx.body())
        self.intend -= 1
        return self.tabs() + 'while (' + exp + ') {' + '\n' \
               + body + '\n' \
               + self.tabs() + '}'

    # Visit a parse tree produced by MyLangParser#if_statement.

    def visitIf_statement(self, ctx: MyLangParser.If_statementContext):
        exp = self.visit(ctx.exp())
        self.intend += 1
        body = self.visit(ctx.body())
        self.intend -= 1
        return self.tabs() + 'if (' + exp + ') {' + '\n' \
               + body + '\n' \
               + self.tabs() + '}'

    # Visit a parse tree produced by MyLangParser#type_.

    def visitType_(self, ctx: MyLangParser.Type_Context):
        basic_type = self.visit(ctx.basic_type())
        array_type = self.visit(ctx.array_type()) if ctx.array_type() else ''
        return basic_type, array_type
        # Visit a parse tree produced by MyLangParser#array_type.

    def visitArray_type(self, ctx: MyLangParser.Array_typeContext):
        if ctx.array_type():
            exp = self.visit(ctx.exp()) if ctx.exp() else ''
            array_type = self.visit(ctx.array_type())
            return '[' + exp + ']' + array_type
        else:
            return ''
        # Visit a parse tree produced by MyLangParser#basic_type.

    def visitBasic_type(self, ctx: MyLangParser.Basic_typeContext):
        return TYPE_MAPPER[ctx.getText()]

        # Visit a parse tree produced by MyLangParser#returned_type.

    def visitReturned_type(self, ctx: MyLangParser.Returned_typeContext):
        if ctx.children:
            return self.visit(ctx.basic_type())
        else:
            return 'void'

        # Visit a parse tree produced by MyLangParser#assigment_statement.

    def visitAssigment_statement(self, ctx: MyLangParser.Assigment_statementContext):
        atom = self.visit(ctx.atom())
        exp = self.visit(ctx.exp())
        return atom + ' = ' + exp

        # Visit a parse tree produced by MyLangParser#atom.

    def visitAtom(self, ctx: MyLangParser.AtomContext):
        id = ctx.ID().__str__()
        array_type = self.visit(ctx.array_type()) if ctx.array_type() else ''
        return id + array_type

        # Visit a parse tree produced by MyLangParser#exp.

    def visitExp(self, ctx: MyLangParser.ExpContext):
        return self.visitChildren(ctx)

        # Visit a parse tree produced by MyLangParser#p.

    def visitP(self, ctx: MyLangParser.PContext):
        num = len(ctx.children)
        q = self.visit(ctx.q())
        if num == 3:
            p = self.visit(ctx.p())
            bin_op = ctx.getChild(1).__str__()
            return p + ' ' + OPERATION_MAPPER.get(bin_op, bin_op) + ' ' + q
        elif num == 2:
            un_op = ctx.getChild(0).__str__()
            return OPERATION_MAPPER.get(un_op, un_op) + q
        else:
            return q

    # Visit a parse tree produced by MyLangParser#q.

    def visitQ(self, ctx: MyLangParser.QContext):
        if ctx.exp():
            exp = self.visit(ctx.exp())
            return '(' + exp + ')'
        elif ctx.atom() or ctx.function_call():
            return self.visitChildren(ctx)
        else:
            return ctx.getText()

    # Visit a parse tree produced by MyLangParser#read_.

    def visitRead_(self, ctx: MyLangParser.Read_Context):
        basic_type = self.visit(ctx.basic_type())
        atom = self.visit(ctx.atom())
        return 'scanf("{}", {}{})'.format(IO_MAPPER[basic_type], '&' if basic_type != 'char*' else '', atom)
        # Visit a parse tree produced by MyLangParser#write_.

    def visitWrite_(self, ctx: MyLangParser.Write_Context):
        basic_type = self.visit(ctx.basic_type())
        atom = self.visit(ctx.atom())
        return 'printf("{}", {})'.format(IO_MAPPER[basic_type], atom)
