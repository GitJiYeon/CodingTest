T = int(input())
sArr =  []
for _ in range(T):
    R, S = input().split()
    sArr.append([R, S])

for i in range(len(sArr)):
    for j in range(len(sArr[i][1])):
        print(int(sArr[i][0])*sArr[i][1][j], end="")
    print()