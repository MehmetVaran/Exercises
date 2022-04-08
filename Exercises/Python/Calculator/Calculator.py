# Mehmet VARAN 181805009

def sum_function(total): # definig sum function
    variable2 = float(input("Number: ")) # getting number
    total = float(total + variable2)  # summing
    return total # going back

def subtraction_function(total): # defining substraction function
    variable2 = float(input("Number: ")) # getting number
    total = float(total - variable2) # substracting
    return total # going back

def multiplication_function(total): # defining multiplication function
    variable2 = float(input("Number: ")) # getting number
    total = float(total * variable2) # multiplication
    return total # going back

def division_function(total): # defining division function
     variable2 = float(input("Number: ")) # getting number
     if variable2 == 0: # if number equals 0, we cant divide
        print("You can not divide any number by 0 !") # warning
     else:
        total = float(total / variable2) # dividing
     return total # going back

def calculator(): # calculator main function
    decider = "empty" # declaring decider
    try:
        total = float(input("Number: "))  # getting first number
    except ValueError: # checking total(first number) value
        print("Invalid Input!!")
        total = float(input("Number: "))
    while decider != "Q": # with this loop, we can make as many as calculation we want
        decider = str(input("Operator: ")) # declaring which operation we make
        if decider == "+": # for calculation
            total = sum_function(total) # new total after using function
            print("Result: ", total) # printing result
        elif decider == "-": # for substraction
            total = subtraction_function(total) # new total after using function
            print("Result: ", total) # printing result
        elif decider == "*": # for multiplication
            total = multiplication_function(total) # new total after using function
            print("Result: ", total) # printing result
        elif decider == "/": # for division
            total = division_function(total) # new total after using function
            print("Result: ", total) # printing result
        else:
            print("Invalid Input!!") # warning


print("Welcome To The Calculator! Operators are +,-,*,/ and Q for quitting")
calculator() # calling function


