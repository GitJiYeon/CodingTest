paperCount = int(input())
paper = [[0 for _ in range(100)] for _ in range(100)]
answer = 0
for _ in range(paperCount):
    x, y = map(int, input().split()) #왼쪽 아래 기준
    #세로 i
    for i in range(100-y, 90-y, -1):
        #가로 j
        for j in range(x, x+10):
            paper[i][j] = 1

for i in range(100):
    for j in range(100):
        if paper[i][j] == 1:
            answer +=1
print(answer)