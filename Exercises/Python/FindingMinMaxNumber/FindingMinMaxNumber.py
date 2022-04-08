# Mehmet VARAN 181805009

def minmax(): # defining minmax function
    try:
        number_counter = int(input("How many numbers are you going to enter ?: "))  # deciding how many number will be entered
    except ValueError: # checking number_counter value
        print("Invalid input!!")
        number_counter = int(input("How many numbers are you going to enter ?: "))

    min = 0 # declaring
    max = 0
    i = 0
    while i < number_counter:  # finding min and max without making any list
        try:
            number = float(input("Enter a number: "))  # getting numbers 1 by 1
        except ValueError: # checking number value
            print("Invalid input!!")
            number = float(input("Enter a number: "))

        if i == 0:      # for the first number, both min and max are equal.
            min = number
            max = number
        else:                     # after the first number, we can check other numbers if it's max or min
            if number > max:      # comparing with the max number
                max = number
            elif min > number:    # comparing with the min number
                min = number
        i += 1             # for the loop

    if i == number_counter:     # after finding min and max, i need to make a tuple for them, so i check if loop is done
        minmaxtuple = (min, max)   # making tuple for min and max numbers
        return minmaxtuple           # going back with tuple


print("Welcome MinMax Calculator")
print(minmax())

















