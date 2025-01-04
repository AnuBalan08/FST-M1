
userInput = input("Enter the list of numbers:")

if userInput.startswith("[") or userInput.endswith("]"):
    userInput = userInput.strip("[]")
removeSpecialChar = tuple(userInput.split(","))
print(type(removeSpecialChar))
for i in removeSpecialChar:
    if int(i) % 5 == 0:
        print( i +" is divisible by 5")