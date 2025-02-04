def solution(n):
    i = 0
    answer = 0
    while i*i < n+1:
        if(i*i == n):
            return 1
        else:
            i += 1
    return 2