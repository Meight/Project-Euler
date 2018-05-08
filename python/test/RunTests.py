import importlib
from timeit import default_timer as timer

solutions = {
    1: "233168",
    2: "4613732",
    3: "6857",
    4: "906609",
    5: "232792560",
    6: "25164150",
    # Todo
    8: "23514624000",
}

for (problem, solution) in sorted(solutions.items()):
    module = importlib.import_module("python.problem.Problem{:d}".format(problem))
    start = timer()
    computedResult = str(module.result())
    executionTime = timer() - start

    print("{:d} {:7f}".format(problem, executionTime * 1_000_000))
