from MyLangLexer import *
from MyLangParser import *
from MyLangVisitor import *
print('lol')
with open('test', 'r') as t:
    try:
         print(MyLangVisitor.visit(MyLangParser(MyLangLexer(t.read()))))
    except Exception as e:
        raise e
