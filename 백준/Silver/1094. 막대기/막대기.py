X = int(input()) #갖고싶은 막대기 길이
sticks = [64, 32, 16, 8, 4, 2, 1]
answer = 0
stickLen = 0

for i in range(len(sticks)):
    if (stickLen + sticks[i] <= X):
        stickLen += sticks[i]
        answer+= 1
        if( stickLen == X):
            break
print(answer)