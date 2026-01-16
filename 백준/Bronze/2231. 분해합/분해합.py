N = int(input())
answer = 0
for i in range(N-1):
    temp = i + sum(map(int, str(i)))
    if temp == N :
        answer = i
        break

print(answer)