def solution(n):
    answer = []
    
    def hanoi(count, start, temp, to):
        if(count == 1):
            answer.append([start, to])
            return
        hanoi(count-1, start, to, temp)
        answer.append([start, to])
        hanoi(count-1, temp, start, to)
    
    hanoi(n, 1, 2, 3)
    return answer