
def fab_number(num):
    if num<=0:
        return 0
    elif num == 1:
        return 1
    else:
        return fab_number(num-1) + fab_number(num-2)

userInput = int(input("Enter your input:"))

if userInput<=0:
    print("Enter correct Input")
for i in range(userInput):
    print(fab_number(i))
