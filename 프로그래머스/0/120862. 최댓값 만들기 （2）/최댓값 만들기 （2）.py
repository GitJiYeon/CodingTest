def solution(numbers):
    max = -10000000000000
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers), 1):
            if numbers[i]*numbers[j] > max:
                max = numbers[i]*numbers[j]
    return max