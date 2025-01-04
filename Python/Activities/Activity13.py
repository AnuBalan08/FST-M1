
def calculate_sum(*args):
    sum = 0
    for num in args:
        sum += num
    return sum

print(calculate_sum(1,2,3,4,5))