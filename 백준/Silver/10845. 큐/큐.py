N = int(input())
queue = []
answer = []
for i in range(N):
    command = list(input().split())
    if command[0] == 'push':
        queue.append(int(command[1]))
    elif command[0] == 'pop' and queue:
        answer.append(queue.pop(0))
    elif command[0] == 'size':
        answer.append(len(queue))
    elif command[0] == 'empty':
        if queue:
            answer.append(0)
        else:
            answer.append(1)
    elif command[0] == 'front' and queue:
        answer.append(queue[0])
    elif command[0] == 'back' and queue:
        answer.append(queue[-1])
    else:
        answer.append(-1)

print('\n'.join(map(str, answer)))
