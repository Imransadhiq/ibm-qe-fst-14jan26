import random
choices = ["rock", "paper", "scissors"]
while True:
    user = input("Enter rock, paper, or scissors: ").lower()
    computer = random.choice(choices)

    print(f"You: {user} | Computer: {computer}")

    if user == computer:
        print("It's a tie!")
    elif (user == "rock" and computer == "scissors") or \
         (user == "paper" and computer == "rock") or \
         (user == "scissors" and computer == "paper"):
        print("You win!")
    elif user in choices:
        print("You lose!")
    else:
        print("Invalid input!")
    play_again = input("Do you want to play again? (yes/no): ").lower()
    if play_again != "yes":
        print("Thanks for playing!")
        break
