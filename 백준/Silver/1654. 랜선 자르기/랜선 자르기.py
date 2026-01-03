K, N = map(int, input().split())
lines = []
for _ in range(K):
    lines.append( int(input()) )

left = 1
right = max(lines)
answer = 0
while left <= right:
    mid = (left + right) // 2
    sumCount = 0
    for i in range(len(lines)):
        sumCount += lines[i] // mid

    if sumCount < N:
        right = mid - 1
    else:
        left = mid + 1
        answer = mid
print(answer)
