from enum import Enum


class Token:
    def __init__(self, str, type):
        self.str = str
        self.type = type

    def __str__(self):
        return self.str


class Tokens(Enum):
    LEFT_PARENTHESIS = 1
    RIGHT_PARENTHESIS = 2
    NAME = 3
    SEMICOLON = 4
    COMMA = 5
    ASTERISK = 6
    EOF = 7


class ParseException(Exception):
    pass


class Node:
    def __init__(self, data, children=[]):
        self.data = data
        self.children = children
