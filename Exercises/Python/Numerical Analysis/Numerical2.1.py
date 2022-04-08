from Tools.scripts.nm2def import symbols

xData = (-2,1,4,-1,3,-4)
yData = (-1,2,59,4,24,-53)
n = 5
a = []
x = symbols("x")

for k in range(1,n+1):
    p = a[n-k] + (x - xData[n-k])*p

m = n+1
a = yData.copy()
for k in range(1,m):
    for i in range(k,m):
        a[i] = (a[i] - a[k-1])/(xData[i] - xData[k-1])



def evalPoly(a,xData,x):
    n = len(xData) - 1 # Degree of polynomial
    p = a[n]
    for k in range(1,n+1):
     p = a[n-k] + (x -xData[n-k])*p
    return p

def coeffts(xData,yData):
    m = len(xData) # Number of data points
    a = yData.copy()
    for k in range(1,m):
        a[k:m] = (a[k:m] - a[k-1])/(xData[k:m] - xData[k-1])
    return a


p = evalPoly(a,xData,x)