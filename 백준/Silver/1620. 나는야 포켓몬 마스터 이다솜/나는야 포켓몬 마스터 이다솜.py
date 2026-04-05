import sys
input = sys.stdin.readline
N, M = map(int, input().split())

nums = {}
names = {}

for i in range(1, N + 1):
    name = input().strip()
    nums[name] = i
    names[i] = name

for _ in range(M):
    q = input().strip()

    if q.isdigit():  # 숫자
        print(names[int(q)])
    else:  # 이름
        print(nums[q])