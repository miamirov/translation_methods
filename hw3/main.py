from hw3.MyLangLexer import *
from hw3.MyLangParser import *
from hw3.visitor import *
import antlr4

with open("MyLang Example", "r") as t:
    text = t.read()

    lexer = MyLangLexer(antlr4.InputStream(text))
    stream = CommonTokenStream(lexer)
    parser = MyLangParser(stream)
    tree = parser.main()
    with open('x.c', 'w') as output:
        print(Visitor().visitMain(tree), file=output)
