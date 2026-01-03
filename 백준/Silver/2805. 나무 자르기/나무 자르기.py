N, M = map(int, input().split())
hight = list(map(int, input().split()))

left = 0
right = max(hight)
maxHeight = 0
while left <= right:
    mid = (left + right) // 2
    temp = sum(h - mid for h in hight if h >= mid)
    if(temp >= M):
        maxHeight = mid
        left = mid + 1
    else:
        right = mid - 1


print(maxHeight)
