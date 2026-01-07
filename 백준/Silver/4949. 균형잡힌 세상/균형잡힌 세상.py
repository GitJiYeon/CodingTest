words = []
while(True):
    str = input()
    if(str == "."):
        break
    else:
        words.append(str[:-1])

answer = []
for word in words:
    stack = []
    isCan = True
    for x in word:
        if(x == ")"):
            if(stack == [] or stack.pop() != "("):
                isCan = False
                break
        elif(x == "[" or x == "("):
            stack.append(x)
        elif(x == "]"):
            if (stack == [] or stack.pop() != "["):
                isCan = False
                break
    if(isCan and stack == []):
        answer.append('yes')
    else:
        answer.append('no')
print('\n'.join(answer))
