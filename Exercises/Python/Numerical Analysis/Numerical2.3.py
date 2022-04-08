# MEHMET VARAN 181805009

#declaring function values as list
myfunc = [0.85866,0.86289,0.86710,0.87129]
# index [0] will be equal to x = 2.36
x = 0
h = 0.01
indexrate = 1 # I multiply h with 100 so i get right index for me
#defining f'(x) calculator function
def fprimefunc(*func):
    return ((-3*func[x])+(4*func[x+indexrate]-func[x+(2*indexrate)]))/(2*h)

#defining f''(x) calculator function
def fdoubleprimefunc(*func):
    return ((2*func[x])-(5*func[x+indexrate])+(4*func[x+(2*indexrate)])-(func[x+(3*indexrate)]))/(h*h)


print("f'(2.36) = %0.4f" % fprimefunc(*myfunc))
print("f''(2.36) = %0.4f" % fdoubleprimefunc(*myfunc))
