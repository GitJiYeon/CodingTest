N = int(input())
A = list(map(int, input().split()))
M = int(input())
B = list(map(int, input().split()))

A.sort()
#있는지 확인
def include_num(num):
    left = 0
    right = N-1
    while left <= right:
        mid = (left+right)//2
        if(A[mid] > num):
            right = mid -1
        elif(A[mid] < num):
            left = mid +1
        else:
            return 1
    return 0

for i in range(M):
    print(include_num(B[i]))