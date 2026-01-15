N, M = map(int, input().split())
cards = list(map(int, input().split()))
answer = 0
for i in range(N-1, -1, -1):
    for j in range(i-1, -1, -1):
        for k in range(j-1, -1, -1):
            sum = cards[i] + cards[j] + cards[k]
            if sum <= M and answer < sum:
                answer = sum

print(answer)
