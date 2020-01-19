from hw2.lexer import *
from hw2.helper import *


class Parser:
    def parse(self, s):
        self.tokens = tokens_generator(s)
        self.cur_token = self.tokens.__next__()
        self.name_num = 0
        node = self.take_s()
        if self.cur_token.type != Tokens.EOF:
            self.unexpected_token()
        return node

    def take_s(self):
        if self.cur_token.type == Tokens.NAME:
            children = [
                self.take_t(),
                self.take_name(),
                self.take_token(Tokens.LEFT_PARENTHESIS),
                self.take_a(),
                self.take_token(Tokens.RIGHT_PARENTHESIS),
                self.take_token(Tokens.SEMICOLON),
            ]
            return Node('S', children)
        else:
            self.unexpected_token()

    def take_name(self):

        if self.cur_token.type != Tokens.NAME:
            raise ParseException('Unexpected token: {}'.format(str(self.cur_token)))
        self.name_num += 1
        tok = self.cur_token
        self.cur_token = self.tokens.__next__()
        return Node('{}: {}'.format('Type' if self.name_num % 2 else 'Name', str(tok)))

    def take_token(self, token):
        if self.cur_token.type != token:
            self.unexpected_token()
        tok = self.cur_token
        self.cur_token = self.tokens.__next__()
        return Node(tok.str)

    def take_a(self):
        if self.cur_token.type == Tokens.RIGHT_PARENTHESIS:
            children = [Node("eps")]
        elif self.cur_token.type == Tokens.NAME:
            children = [
                self.take_t(),
                self.take_name(),
                self.take_arr(),
                self.take_a_(),
            ]
        else:
            self.unexpected_token()
        return Node('A', children)
    def take_arr(self):
        print(str(self.cur_token))
        if self.cur_token.type == Tokens.LEFT_BRACK:
            children = [
                self.take_token(Tokens.LEFT_BRACK),
                self.take_token(Tokens.RIGHT_BRACK)
            ]
        else:
            children = [Node('eps')]
        return Node('Arr', children)
    def take_a_(self):
        if self.cur_token.type == Tokens.RIGHT_PARENTHESIS:
            children = [Node('eps')]
        elif self.cur_token.type == Tokens.COMMA:
            children = [
                self.take_token(Tokens.COMMA),
                self.take_t(),
                self.take_name(),
                self.take_arr(),
                self.take_a_()   
            ]
        else:
            self.unexpected_token()
        return Node('A', children)

    def take_m(self):
        if self.cur_token.type == Tokens.NAME:
            children = [Node('eps')]
        elif self.cur_token.type == Tokens.ASTERISK:
            children = [
                self.take_token(Tokens.ASTERISK),
                self.take_m(),
            ]
        else:
            self.unexpected_token()
        return Node('M', children)

    def take_t(self):
        if self.cur_token.type == Tokens.NAME:
            children = [
                self.take_name(),
                self.take_m()
            ]
        else:
            self.unexpected_token()
        return Node('T', children)

    def unexpected_token(self):
        raise ParseException('Unexpected token: {}'.format(str(self.cur_token)))


Parser().parse('int b(int* **a, int *b, int *c);')