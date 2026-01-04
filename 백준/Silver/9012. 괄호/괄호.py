T = int(input())
P = []
for i in range(T):
    P.append(input())

def VPS(str):
    stack = []
    for c in str:
        if c == '(':
            stack.append(c)
        elif c == ')':
            if(len(stack) == 0):
                return 'NO'
            stack.pop()
    if(len(stack) == 0):
        return 'YES'
    else:
        return 'NO'

for i in range(T):
    print(VPS(P[i]))
