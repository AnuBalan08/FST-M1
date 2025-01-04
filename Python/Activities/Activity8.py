

userInput = input("Enter the list of numbers:")

if userInput.startswith("[") or userInput.endswith("]"):
    userInput = userInput.strip("[]")
removeSpecialChar = list(userInput.split(","))  # while split I think it automatically converts as list but though to showI have explicity mentioned list
if removeSpecialChar[0] == removeSpecialChar[-1]:
    print(True)
else: print(False)