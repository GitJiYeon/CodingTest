n = int(input())
for i in range(n):
    temp = ""
    for j in range(1, i+2, 1):
        temp += "*"
    print(temp)
