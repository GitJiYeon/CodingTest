def solution(n_str):
    answer = ''
    index0 = 0
    for i in range(len(n_str)):
        if(n_str[i] != '0'):
            index0 = i
            break
    for i in range(index0, len(n_str), 1):
        answer += n_str[i]
    return answer