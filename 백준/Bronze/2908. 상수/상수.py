A, B = input().split()
A = int( "".join([A[x] for x in range(len(A)-1, -1, -1)]) )
B = int( "".join([B[x] for x in range(len(B)-1, -1, -1)]) )
if(A > B):
    print(A)
else:
    print(B)

