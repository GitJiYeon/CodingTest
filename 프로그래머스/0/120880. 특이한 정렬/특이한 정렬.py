def solution(numlist, n):
    sorted_list = []
    temp = []

    for x in numlist:
        distance = abs(x - n)
        temp.append((distance, -x, x))

    temp.sort()

    for item in temp:
        sorted_list.append(item[2])

    return sorted_list
