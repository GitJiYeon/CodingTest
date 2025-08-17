list = [0 for _ in range(31)]
answer = []
for _ in range(28):
    student = int(input())
    list[student] = 1
    
for i in range(1, len(list)):
    if list[i] == 0:
        answer.append(i)
     
print(*answer)