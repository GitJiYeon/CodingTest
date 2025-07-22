def solution(n):
    def isPrime(num):
        for i in range(2, int(num ** 0.5) + 1):
            if(num % i == 0):
                return False
        return True;
    count = 0;
    for i in range(3, n+1, 2):
        if isPrime(i):
            count+=1
    return count+1