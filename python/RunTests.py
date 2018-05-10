import importlib, sys
from timeit import default_timer as timer

if len (sys.argv) != 2 :
    print("Usage: python RunTests.py saveFilePath")
    sys.exit (1)

fileName = sys.argv[1]

solutions = {
    1: "233168",
    2: "4613732",
    3: "6857",
    4: "906609",
    5: "232792560",
    6: "25164150",
    7: "104743",
    8: "23514624000",
}

with open(fileName, 'a') as saveFile:
    for (problem, solution) in sorted(solutions.items()):
        module = importlib.import_module("Problem{:d}".format(problem))
        start = timer()
        computedResult = str(module.result())
        executionTime = timer() - start

        saveFile.write("{:d} {:0f}\n".format(problem, executionTime * 1_000_000))

