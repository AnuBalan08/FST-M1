
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

choices = ["rock", "paper", "scissors"]


user1_answer = input(f"{user1}, do you want to choose rock, paper, or scissors? ").lower()
while user1_answer not in choices:
    print("Invalid input! Please choose rock, paper, or scissors.")
    user1_answer = input(f"{user1}, do you want to choose rock, paper, or scissors? ").lower()

user2_answer = input(f"{user2}, do you want to choose rock, paper, or scissors? ").lower()
while user2_answer not in choices:
    print("Invalid input! Please choose rock, paper, or scissors.")
    user2_answer = input(f"{user2}, do you want to choose rock, paper, or scissors? ").lower()

if user1_answer == user2_answer:
    print("It's a tie!")
elif (user1_answer == "rock" and user2_answer == "scissors") or (user1_answer == "scissors" and user2_answer == "paper") or (user1_answer == "paper" and user2_answer == "rock"):
    print(f"{user1} wins with {user1_answer}!")
else:
    print(f"{user2} wins with {user2_answer}!")
play_again = input("Do you want to play another round? (yes/no): ").lower()
if play_again == "yes":       
    print("Continue playing") 
else: print("Stop playing")



