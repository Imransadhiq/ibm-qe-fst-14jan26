try:
    print(nil)
except NameError:
    print("A NameError occurred: variable is not defined.")
finally:
    print("Execution continues despite the error.")