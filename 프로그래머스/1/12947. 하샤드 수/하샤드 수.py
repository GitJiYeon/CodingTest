def solution(x):
    temp = str(x)
    sum_digits = 0
    for i in temp:
        sum_digits += int(i)
    return x % sum_digits == 0