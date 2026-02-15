N = int(input())
arr = []
for i in range(N):
    x, y = map(int, input().split())
    arr.append([x, y])
answer = sorted(arr, key=lambda x: (x[1], x[0]) )

for x, y in answer:
    print(x, y)