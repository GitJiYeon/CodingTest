N, M = map(int, input().split())

min_set = 1001
min_single = 1001

for _ in range(M):
    set_price, single_price = map(int, input().split())
    min_set = min(min_set, set_price)
    min_single = min(min_single, single_price)

min_single = min(min_single, min_set)

answer = 1_000_000 

for sets in range((N // 6) + 2): 
    total = sets * min_set
    remaining = max(0, N - sets * 6)
    total += remaining * min_single
    answer = min(answer, total)

print(answer)
