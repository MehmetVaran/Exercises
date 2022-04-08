# MEHMET VARAN 
import numpy

# Defining function to integrate
def f(x):
    return x*numpy.cos(x)


# Implementing Simpson's 1/3
def simpson13(x0, xn, n):
    # calculating step size
    h = (xn - x0) / n

    # Finding sum
    integration = f(x0) + f(xn)

    for i in range(1, n):
        k = x0 + i * h

        if i % 2 == 0:
            integration = integration + 2 * f(k)
        else:
            integration = integration + 4 * f(k)

    # Finding final integration value
    integration = integration * h / 3

    return integration


# Input section
result1 = simpson13(0,numpy.pi,2)
result2 = simpson13(0,numpy.pi,4)
result3 = simpson13(0,numpy.pi,6)

print("Integration result by Simpson's 1/3 method for n = 2 is: %0.4f" % (result1))
print("Integration result by Simpson's 1/3 method for n = 4 is: %0.4f" % (result2))
print("Integration result by Simpson's 1/3 method for n = 6 is: %0.4f" % (result3))
