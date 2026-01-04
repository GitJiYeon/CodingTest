N, C = map(int, input().split())
X = []
for i in range(N):
    X.append(int(input()))
X.sort()

left = 1
right = X[-1] - X[0]

answer = 0
while left <= right:
    mid = (left + right) // 2
    buildCnt = 1
    currentBuildIdx = 0
    for i in range(currentBuildIdx+1, N):
        if X[i] - X[currentBuildIdx] >= mid:
            buildCnt += 1
            currentBuildIdx = i
    if(buildCnt >= C): #적절하면 거리를 더 늘ㄹㅕ봄
        answer = mid
        left = mid+1
    else: #적절하지 않으면 거리를 좁혀봄
        right = mid-1
print(answer)

