def show():
    return "Functions show() called"
print(show())


def show_message(*pet):
    print("I have a pet named " + pet[3])
show_message("Buddy","Chppi","Lion","Tiger")


def country(c = "India"):
    print("I am from " + c)
country("USA")
country("Turkey")
country()  # uses default value