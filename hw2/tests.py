import pytest
from hw2.vizualize import *
bad_tests = [
    'int a(int)',
    'int a(,)',
    'double *a(int a,);',
]

good_tests = [
    'int main(int argc[], char** argv);',
    'void f();',
    'int f(char* a);',
    'int f(char ** a);',
    'int f(type * * * name);',
    'int f(x a, y b[], z c[]);',
]


@pytest.mark.parametrize('i, s', enumerate(good_tests))
def test_good(s, i):
    vizualize(Parser().parse(s), str(i))


@pytest.mark.parametrize('s', bad_tests)
def test_bad(s):
    with pytest.raises(ParseException):
        assert Parser().parse(s)

