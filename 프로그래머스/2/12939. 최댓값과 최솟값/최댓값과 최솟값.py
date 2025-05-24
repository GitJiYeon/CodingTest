def solution(s):
    arr = list(map(int, s.split()))
    arr.sort()
    return str(arr[0]) + " " + str(arr[-1])

#아니 파이썬은 이렇게 짧다고?