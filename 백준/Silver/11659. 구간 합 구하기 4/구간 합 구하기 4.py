import sys
input = sys.stdin.readline
N,M = map(int,input().split())
arr = list(map(int,input().split()))
#prefix = 누적합이라는 뜻
prefix = [0] * (N+1)
#ex) 입력이 5, 4, 3, 2, 1 일 때
#prefix는 [0, 5, 9, 12, 14, 15]
answer = []
for i in range(N):
    prefix[i+1] = prefix[i] + arr[i]

for _ in range(M):
    a, b = map(int, input().split())
    #prefix[b] - prefix[a-1] 는 구간 합
    answer.append(prefix[b] - prefix[a-1])

print( "\n".join(map(str, answer)) )
