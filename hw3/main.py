from hw3.MyLangLexer import *
from hw3.MyLangParser import *
from hw3.MyLangVisitor import *

with open("MyLang Example", "r") as t:
    text = t.read()
    lexer = MyLangLexer(text)
    parser = MyLangParser(CommonTokenStream(Lexer))


