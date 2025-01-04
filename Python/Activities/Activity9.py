userInput1 = input("Enter the list of numbers for list 1:")
userInput2 = input("Enter the list of numbers for list 2:")

if (userInput1.startswith("[") or userInput1.endswith("]")) and (userInput2.startswith("[") or userInput2.endswith("]")):
    userInput1 = userInput1.strip("[]")
    userInput2 = userInput2.strip("[]")
removeSpecialCharList1 = list(userInput1.split(","))
removeSpecialCharList2 = list(userInput2.split(","))
finalList =[]
for num in removeSpecialCharList1:
    if int(num)%2!=0:
        finalList.append(num)

for num in removeSpecialCharList2:
    if int(num)%2==0:
        finalList.append(num)

print(finalList)