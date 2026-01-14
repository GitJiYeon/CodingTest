from operator import countOf

N = int(input())
#S, M, L, XL, XXL, XXXL 순
sizes = list(map(int, input().split()))
T, P = map(int, input().split())

countT = 0
for s in sizes:
    countT += s // T
    temp = s % T
    if temp > 0:
        countT += 1
print(countT)
print(str(N // P)+" "+str(N % P))


