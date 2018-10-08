# print("Enter Upper Limit")
# try:
#     n = int(input())  #reading upper limit from the user.
#     if n <= 0:
#         raise ValueError()    #raising exception when user enters a negative number
#     else:
#         print("The odd numbers in the range of 1 through {}".format(n))
#         for i in range(1, n + 1):   #for-loop to print odd numbers in the range 1 to upperlimit(inclusive)
#             if i % 2 == 1:
#                 print(i)
# except ValueError:  #handling raised exception printing error message
#     print("Error: Upper Limit should be greater than zero")
print("Enter Upper Limit")
try:
    n = int(input())  #reading upper limit from the user.
    if n <= 0:
        raise ValueError()    #raising exception when user enters a negative number
    else:
        print("The odd numbers in the range of 1 through {}".format(n))
        i = 1
        while i <= n:   #while-loop to print odd numbers in the range 1 to upperlimit(inclusive)
            if i % 2 == 1:
                print(i)
            i += 1
except ValueError:  #handling raised exception printing error message
    print("Error: Upper Limit should be greater than zero")
