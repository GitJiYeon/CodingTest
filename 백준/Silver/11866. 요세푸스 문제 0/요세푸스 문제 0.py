from collections import deque
N, K = map(int, input().split())

queue = deque()
answer = []
for i in range(1, N+1):
    queue.append(i)

count = 0
while queue:
    temp = queue.popleft()
    count+=1

    if count % K != 0:
        queue.append(temp)
    else:
        answer.append(temp)

print("<", end="")
for i in range(len(answer)-1):
    print(answer[i], end=", ")
print(str(answer[-1])+">", end="")
