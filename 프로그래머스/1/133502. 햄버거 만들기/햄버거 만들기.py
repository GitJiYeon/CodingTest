def solution(ingredient):
    answer = 0
    stack = []
    for i in range(len(ingredient)):
        stack.append(ingredient[i])
        
        if(len(stack) >= 4):
            l = len(stack)
            if(stack[l - 1] == 1 and stack[l - 2] == 3 and stack[l - 3] == 2 and stack[l - 4] == 1):
                stack.pop()
                stack.pop()
                stack.pop()
                stack.pop()
                answer += 1;
    return answer