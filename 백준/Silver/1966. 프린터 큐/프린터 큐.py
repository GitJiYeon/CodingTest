from collections import deque

answer = 0
T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    priorities = list(map(int, input().split()))

    queue = deque()
    for i in range(N):
        queue.append((priorities[i], i))
    order = 0

    while(True):
        current = queue.popleft()
        if any(current[0] < q[0] for q in queue):
            queue.append(current)
        else:
            order += 1
            if( current[1] == M ):
                print(order)
                break


