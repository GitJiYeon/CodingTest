import sys
input = sys.stdin.readline

S = set()
N = int(input())

for i in range(N):
    user = input().strip()
    if user == "all":
        S = {x for x in range(1, 21)}
        continue
    if user == "empty":
        S = set()
        continue
    command, val = user.split()
    val = int(val)
    if command == "add":
        S.add(val)
    elif command == "remove":
        S.discard(val)
    elif command == "check":
        if val in S:
            print('1')
        else:
            print('0')
    elif command == "toggle":
        if val in S:
            S.remove(val)
        else:
            S.add(val)

