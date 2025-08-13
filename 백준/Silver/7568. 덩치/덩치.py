N = int(input()) #사람수
info = []
for _ in range(N):
    info.append(list(map(int, input().split())) )
ranking = [0 for _ in range(N)]
for i in range(N):
    rank = 1
    for j in range(N):
        if(i != j and info[i][0] < info[j][0] and info[i][1] < info[j][1]):
            rank += 1
    ranking[i] = rank

print(*ranking)