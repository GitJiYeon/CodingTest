N = int(input())

stack = []
answer = []
for i in range(N):
    command = input().split()
    if(command[0] == "push"):
        stack.append(int(command[1]))
    elif(command[0] == "pop" and stack):
        answer.append(stack.pop())
    elif(command[0] == "top" and stack):
        answer.append(stack[-1])
    elif(command[0] == "size"):
        answer.append(len(stack))
    elif(command[0] == "empty"):
        if(stack):
            answer.append(0)
        else:
            answer.append(1)
    else:
        answer.append(-1)

for x in answer:
    print(x)

