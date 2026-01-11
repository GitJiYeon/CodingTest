A, B = input().split()

answer = len(A)

for i in range(len(B) - len(A) + 1): #A 비교 시작지점
    count = 0
    for j in range(len(A)):
        if A[j] != B[i + j]:
            count += 1
    if count < answer:
        answer = count

print(answer)
