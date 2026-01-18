N = int(input())
A = list(map(int, input().split()))

arr = [(A[i], i) for i in range(N)]

arr.sort()

P = [0] * N

for b_idx, (_, original_idx) in enumerate(arr):
    P[original_idx] = b_idx

print(*P)
