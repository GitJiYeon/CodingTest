def solution(arr):
    answer = []
    min = arr[0]
    for i in range(len(arr)):
        if(min > arr[i]):
            min = arr[i]
    for i in range(len(arr)):
        if(arr[i] != min):
            answer.append(arr[i])
    if len(answer) != 0:
        return answer
    else:
        return [-1]

        