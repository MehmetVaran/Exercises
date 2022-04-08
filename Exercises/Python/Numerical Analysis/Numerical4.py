# Mehmet VARAN 181805009
def jacobiFunc(u,v,w):
    i = 0
    while i < 3:
        ufunc = (-2 + v - w) / 3
        vFunc = (1 - u + 2 * w) / (-8)
        wFunc = (4 - u - v) / 5
        u = ufunc
        v = vFunc
        w = wFunc
        i +=1
        print(i,". Iteration")
        print("u =",u," v =",v ," w =",w)
        print()

jacobiFunc(0,0,0)


