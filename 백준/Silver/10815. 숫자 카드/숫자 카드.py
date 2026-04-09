import sys
input = sys.stdin.readline

N = int(input())
cards = set(map(int, input().split()))

M = int(input())
targets = list(map(int, input().split()))

for t in targets:
    if t in cards:
        print(1, end=' ')
    else:
        print(0, end=' ')