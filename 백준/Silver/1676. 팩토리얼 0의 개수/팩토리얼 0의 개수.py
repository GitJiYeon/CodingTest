N = int(input())

answer = 0
for i in range(1, N):
    temp = 5**i
    if(temp > N):
        break
    answer += N//temp
print(answer)


