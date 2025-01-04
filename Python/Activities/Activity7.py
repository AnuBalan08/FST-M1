

userInput = input("Enter the list of numbers:")

if userInput.startswith("[") or userInput.endswith("]"):
    userInput = userInput.strip("[]")
removeSpecialChar = list(userInput.split(","))
sumOfNum = 0
for num in removeSpecialChar:
    sumOfNum += int(num)
print(sumOfNum)