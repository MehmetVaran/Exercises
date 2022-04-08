# MEHMET VARAN 181805009

def func(x):
    return 3 * (x * x * x) + (x * x) - x - 5


def bisection(a, b):
    if (func(a) * func(b) >= 0):
        print("You have not assumed right a and b\n")
        return

    i = 1
    while ((b - a) >= 0.0001): # this decides how close I can get to the root

        # Finding middle point
        c = (a + b) / 2

        # Checking if middle point is root(probably never get this if because error point is big)
        if (func(c) == 0.0):
            break

        print("Step", i, ": ", "a=", "%.4f" % a, "  b=", "%.4f" % b, " f(", "%.4f" % c, "):", "%.4f" % func(c))

        # Deciding for the number that will be changed for the new interval
        if (func(c) * func(a) < 0):
            b = c
        else:
            a = c
        i = i+1


a = 1
b = 2
bisection(a, b)
