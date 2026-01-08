import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
queue = deque()
answer = []
for i in range(N):
    command = list(input().split())
    if command[0] == 'push':
        queue.append(command[1])
    elif command[0] == 'pop':
        answer.append(queue.popleft() if queue else -1)
    elif command[0] == 'size':
        answer.append(len(queue))
    elif command[0] == 'empty':
        answer.append(0 if queue else 1)
    elif command[0] == 'front':
        answer.append(queue[0] if queue else -1)
    elif command[0] == 'back':
        answer.append(queue[-1] if queue else -1)

print('\n'.join(map(str, answer)))