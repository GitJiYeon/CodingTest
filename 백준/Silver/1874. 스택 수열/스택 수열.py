N = int(input())
arr = []
for i in range(N):
    arr.append(int(input()))

stack = []
answer = []
idx = 0
isCan = True
num = 1 #1부터 시작
for x in arr:
    while(num <= x):
        stack.append(num)
        answer.append("+")
        num+=1

    if stack and stack[-1] == x:
        stack.pop()
        answer.append("-")
    else:
        isCan = False
        break
if(isCan):
    for a in answer:
        print(a)
else:
    print("NO")

