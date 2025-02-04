def solution(n, t):
    a = 1
    for i in range(1, t+1, 1):
        a = a*2
    answer = n*a
    return answer

