def solution(arr, flag):
    answer = []
    for i in range(len(flag)):
        if(flag[i]):
            for j in range(0, arr[i]*2, 1):
                answer.append(arr[i])
        else:
            for j in range(arr[i]):
                answer.pop()
    return answer