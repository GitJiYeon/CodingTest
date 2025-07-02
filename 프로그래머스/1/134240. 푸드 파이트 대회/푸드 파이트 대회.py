import math

def solution(food):
    answer = ''
    for i in range(1, len(food)):
        temp = food[i]
        if temp % 2 != 0:
            temp -= 1
        for j in range(temp // 2):
            answer += str(i)

    reverseAnswer = answer[::-1]
    return answer + '0' + reverseAnswer
