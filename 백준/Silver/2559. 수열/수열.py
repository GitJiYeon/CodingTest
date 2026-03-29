N, K = map(int, input().split())
arr = list(map(int, input().split()))

temp = sum(arr[:K])
answer = temp

for i in range(K, N):
    temp += arr[i]
    temp -= arr[i-K]
    if temp > answer:
        answer = temp

print(answer)