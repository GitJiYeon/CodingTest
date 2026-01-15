N = int(input())
nums = list(map(int, input().split()))

answer = 0
for n in nums:
    isSosu = True
    for i in range(n-1, 1, -1):
        if n % i == 0:
            isSosu = False

    if(isSosu and n != 1):
        answer += 1

print(answer)
