N, K = map(int, input().split())
#nCk = n! / (k! (n-k)!)
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)
answer = factorial(N) // (factorial(K) * factorial(N - K))
print(answer)