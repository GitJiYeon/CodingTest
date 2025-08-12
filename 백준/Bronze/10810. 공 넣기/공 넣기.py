N, M = map(int, input().split())
bowl = [0 for i in range(N)]

for i in range(M):
    start, end, num = map(int, input().split())
    for j in range(start, end+1):
        bowl[j-1] = num

print(*bowl)