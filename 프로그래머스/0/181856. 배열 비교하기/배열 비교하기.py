def solution(arr1, arr2):
    some1 = 0
    some2 = 0
    if len(arr1) > len(arr2):
        return 1
    elif len(arr2) > len(arr1):
        return -1
    else:
        for i in range(len(arr1)):
            some1 += arr1[i]
            some2 += arr2[i]
        if some1 > some2:
            return 1
        elif some2 > some1:
            return -1
    return 0