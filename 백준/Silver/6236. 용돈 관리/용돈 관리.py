N, M = map(int, input().split())
money = []
for i in range(N):
    money.append(int(input()))

#하루에 인출할 돈 범위
left = max(money) #하루 값 이상 무조건 인출해야됨
right = sum(money) #하루에 한번씩 최대로 인출
answer = 0
while left <= right:
    mid = (left + right) // 2
    currentMoney = 0
    takeCount = 0
    for i in range(N):
        if(money[i] > mid):
            takeCount = M + 1
            break
        if(currentMoney >= money[i]):
            currentMoney -= money[i]
        else:
            currentMoney = mid #새로 인출
            currentMoney -= money[i]
            takeCount += 1
    if(takeCount <= M):
        answer = mid
        right = mid - 1 #더 작은 값도 확인
    else:
        left = mid + 1
print(answer)