def solution(n):
    for i in range(1, n, 1):
        if(int(n % i) == 1):
            return i
        