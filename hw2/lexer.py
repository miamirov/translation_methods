from string import ascii_letters, digits, whitespace
from hw2.helper import *


def tokens_generator(s):
    buf = []

    for i, ch in enumerate(s):
        if ch in ascii_letters or ch in digits or ch == '_':
            buf.append(ch)
            continue
        if buf:
            yield Token(''.join(buf), Tokens.NAME)
            buf.clear()
        if ch in whitespace:
            continue
        if ch == ';':
            yield Token(';', Tokens.SEMICOLON)
            continue
        if ch == ',':
            yield Token(',', Tokens.COMMA)
            continue
        if ch == ')':
            yield Token(')', Tokens.RIGHT_PARENTHESIS)
            continue
        if ch == '(':
            yield Token('(', Tokens.LEFT_PARENTHESIS)
            continue
        if ch == '*':
            yield Token('*', Tokens.ASTERISK)
            continue
        if ch == ']':
            yield Token(']', Tokens.RIGHT_BRACK)
            continue
        if ch == '[':
            yield Token('[', Tokens.LEFT_BRACK)
            continue
        raise ParseException('Unknown character {} in position'.format(ch))
    if buf:
        yield Token(''.join(buf), Tokens.NAME)
    yield Token('$', Tokens.EOF)
