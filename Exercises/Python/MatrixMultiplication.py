# Mehmet VARAN - 181805009
def GettingMatrix():
    firstFlag = 0
    while firstFlag != 1:
       try:
           rowNumber = int(input("Enter the row number:"))
           firstFlag = 1
       except ValueError:
           print("Invalid Input!!")
           firstFlag = 0

    secondFlag = 0
    while secondFlag != 1:
        try:
            columnNumber = int(input("Enter the column number:"))
            secondFlag = 1
        except ValueError:
            print("Invalid Input!!")
            secondFlag = 0

    matrixList = [[0.0]]
    i = 0
    j = 0

    while j < rowNumber:
        while i < columnNumber:
            print("Row Number:", j, "Column Number:", i)
            thirdFlag = 0
            while thirdFlag != 1:
                try:
                    number = float(input("Enter the number:"))
                    thirdFlag = 1
                except:
                    print("Invalid Input!!")
                    thirdFlag = 0

            matrixList[j].append(number)
            i +=1
        j +=1
        i = 0
        matrixList.append([0.0])
    matrixList.pop()
    for i in range (len(matrixList)):
        del matrixList[i][0]

    return matrixList

def MultiplicationMatrix(Matrix1,Matrix2):
    rowNumber = len(Matrix1)
    columnNumber = len(Matrix2[0])

    matrixList = [[0.0]]
    i = 0
    j = 0
    k = 0
    number = 0.0

    while i < rowNumber:
        while j < columnNumber:
            while k < (len(Matrix1[0])):
                number = Matrix1[i][k] * Matrix2[k][j] + number
                k += 1
            matrixList[i].append([0.0])
            matrixList[i][j] = number

            k = 0
            j += 1
            number = 0.0
        matrixList.append([0.0])
        j = 0
        i += 1
    matrixList.pop()
    for l in range (len(matrixList)):
        matrixList[l].pop()

    return matrixList

def PrintingMatrix(resultMatrix):
    for k in range (len(resultMatrix)):
        print(resultMatrix[k])

def MainMatrixMultiplicationMatrix():
    print("Welcome To The Matrix Multiplicator !!")
    firstMatrix = GettingMatrix()
    secondMatrix = GettingMatrix()
    while len(firstMatrix[0]) != len(secondMatrix):
        print("You can't multiply these matrix. First matrix's row number and second matrix's column number must be equal !!")
        secondMatrix = GettingMatrix()

    resultMatrix = MultiplicationMatrix(firstMatrix, secondMatrix)
    PrintingMatrix(resultMatrix)

MainMatrixMultiplicationMatrix()













