def solution(rsp):
    answer = "";
    for i in range(len(rsp)):
        ch = rsp[i]
        if (ch == '2') :
            answer += '0'
        elif (ch == '0') :
            answer += '5'
        elif (ch == '5') :
                answer += '2'
            
        
    return answer;