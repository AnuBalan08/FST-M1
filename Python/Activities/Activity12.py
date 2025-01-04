
def adding_num(num):
    if num:
        return num+adding_num(num-1)
    else:
        return 0

print(adding_num(int(input("Enter Your Input: "))))