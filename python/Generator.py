try:
    num = int(input("Enter a number: "))
    print(10 / num)
except ValueError:
    print("Please enter a valid number")
except ZeroDivisionError:
    print("Number cannot be zero")
else:
    print("Division successful")
finally:
    print("Program ended")
