import sys
# input() : 가공까지 해서 느림
# sys.stdin.readline() : 한 줄 그대로 불러오기
input = sys.stdin.readline
N = int(input())

stack = []
answer = []
for i in range(N):
    command = list(map(int, input().split()))
    if(command[0] == 1):
        stack.append(command[1])
    elif(command[0] == 2 and stack):
        answer.append(stack.pop())
    elif (command[0] == 3):
        answer.append(len(stack))
    elif (command[0] == 4):
        if(stack):
            answer.append(0)
        else:
            answer.append(1)
    elif (command[0] == 5 and stack):
        answer.append(stack[-1])
    else:
        answer.append(-1)

print("\n".join(map(str, answer)))
"""
얘보다 join이 더 빠름
for i in answer:
    print(i)
"""