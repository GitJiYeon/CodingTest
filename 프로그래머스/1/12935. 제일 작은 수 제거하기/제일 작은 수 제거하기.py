def solution(arr):
    answer = []
    min_value = min(arr)
    """
    아니 파이썬에는 min() 함수가 있다고요?
    min = arr[0]
    for i in range(len(arr)):
        if(min > arr[i]):
            min = arr[i]
    """
    for i in range(len(arr)):
        if(arr[i] != min_value):
            answer.append(arr[i])
    if len(answer) != 0:
        return answer
    else:
        return [-1]

        