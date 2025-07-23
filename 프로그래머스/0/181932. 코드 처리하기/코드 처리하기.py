def solution(code):
    answer = ''
    mode = 0;
    for i in range(0, len(code)):
        if mode == 0:
            if code[i] != '1':
                if(i % 2 == 0): #짝수
                    answer += code[i]
            else:
                mode = 1
        else:
            if code[i] != '1':
                if(i % 2 != 0): #홀수
                    answer += code[i]
            else:
                mode = 0
                
    if len(answer) == 0:
        return "EMPTY"
    return answer