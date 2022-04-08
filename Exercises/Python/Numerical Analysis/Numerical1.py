# Mehmet VARAN 
import math
# resultapp and resultreal have first term of the taylor series. I can't create a function that has first term in it. So I take it outside of the function.

resultApproximate = 10.5306 # 6 significant digit - 1st term on the taylor series
resulexact = 10.5306487525 # exact value - 1st term on the taylor series
x = 4 # this is x in taylor series not x0

def TaylorCalcFrom2ndTerm(x): # It starts from 2nd term and ends at 5th term
    i = 1
    taylorResult = 0
    while i < 5:
        taylorfunc = (math.exp(2) * (x-2)**i) / math.factorial(i) # power series
        taylorResult = taylorResult + taylorfunc
        i += 1
    return taylorResult

resulexact = resulexact + TaylorCalcFrom2ndTerm(x)
resultApproximate = resultApproximate + TaylorCalcFrom2ndTerm(x)
absoluteError = abs(resulexact - resultApproximate)
relativeError = absoluteError / resulexact
percentageError = relativeError * 100
print("Real result is", resulexact)
print("Approximate result is" , resultApproximate)
print("Absolute error is" , absoluteError)
print("Relative error is", relativeError)
print("Percentage error is", percentageError)
