def solution(my_string, s, e):
    result = []
    result.append(my_string[:s])
    result.append(my_string[s:e+1][::-1])
    result.append(my_string[e+1:])
    return ''.join(result)