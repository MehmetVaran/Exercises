# Mehmet VARAN 
import numpy as np

def LUdecomp(a):
    n = len(a)
    for k in range(0, n - 1):
        for i in range(k + 1, n):
            if a[i, k] != 0.0:
                lam = a[i, k] / a[k, k]
                a[i, k + 1:n] = a[i, k + 1:n] - lam * a[k, k + 1:n]
                a[i, k] = lam
    return a

def LUsolve(a,b):
    n = len(a)
    for k in range(1, n):
        b[k] = b[k] - np.dot(a[k, 0:k], b[0:k])
    b[n - 1] = b[n - 1] / a[n - 1, n - 1]
    for k in range(n - 2, -1, -1):
        b[k] = (b[k] - np.dot(a[k, k + 1:n], b[k + 1:n])) / a[k, k]
    return b

arrayMain = np.array([[3,1,2],[6,3,4],[3,1,5]])
arrayB = np.array([0,1,3])

print(LUsolve(LUdecomp(arrayMain), arrayB))

