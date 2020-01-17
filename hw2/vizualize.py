from hw2.parser import *
from graphviz import Graph


def vizualize(node, name):
    g = Graph(format='png')
    cnt = 0

    def dfs(v):
        nonlocal cnt
        v.num = cnt
        cnt += 1
        g.node(str(v.num), label=v.data)
        for child in v.children:
            dfs(child)
            g.edge(str(v.num), str(child.num))

    dfs(node)
    g.render(name, './vizualizations/')


if __name__ == "__main__":
    from hw2.tests import good_tests

    for i, test in enumerate(good_tests):
        vizualize(Parser().parse(test), str(i))
