import math
T = int(input())

def func(N, M):
    m = math.factorial(M)
    n = math.factorial(N) * math.factorial(M-N)
    return m // n

for _ in range(T):
    N, M = map(int, input().split())
    print(func(N, M))
