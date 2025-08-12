N, M = map(int, input().split())
bowl = [i+1 for i in range(N)]

for i in range(M):
    start, end = map(int, input().split())
    for j in range((end - start + 1)//2):
        temp = bowl[start+j-1]
        bowl[start+j-1] = bowl[end-j-1]
        bowl[end-j-1] = temp

print(*bowl)