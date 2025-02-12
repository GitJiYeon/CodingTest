def solution(my_string):
    answer = 0
    for i in range(len(my_string)):
        a = my_string[i]
        if a.isdigit():
            answer += int(a)
    return answer
