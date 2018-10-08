print("Checker Board of size 7x7")
print()
for i in range(0, 7):  #Nested for-loops to print checkerboard pattern
    for j in range(0, 7):
        if i % 2 == 0:
            if j % 2 == 0:
                print("#", end = " ")  #the argument end=" " in print is used to end the line after printing with given value.
            else:
                print(" ", end = " ")
        else:
            if j % 2 == 0:
                print(" ", end = " ")
            else:
                print("#", end = " ")
    print()
