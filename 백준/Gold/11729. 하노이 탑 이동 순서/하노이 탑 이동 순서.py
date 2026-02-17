n = int(input())
logs = []
def hanoi(n, A, B, C):
    if n == 0:
        return
    hanoi(n-1, A, C, B)
    logs.append(str(A)+" "+str(C))
    hanoi(n-1, B, A, C)

hanoi(n, 1, 2, 3)
print(len(logs))
print('\n'.join(logs))