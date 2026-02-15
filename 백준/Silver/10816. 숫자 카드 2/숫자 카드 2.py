N = int(input())
nums = input().split()
M = int(input())
cardNums = input().split()

dict = {x: 0 for x in cardNums}

for n in nums:
    if n in dict:
        dict[n] += 1
for c in cardNums:
    print(dict[c], end=" ")