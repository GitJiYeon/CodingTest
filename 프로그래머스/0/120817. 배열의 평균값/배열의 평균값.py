def solution(numbers):
    some = 0;
    for i in range(len(numbers)):
        some += numbers[i]
    return some / len(numbers)