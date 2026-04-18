def solution(X, Y):
    countX = [0] * 10
    countY = [0] * 10

    for x in X:
        countX[int(x)] += 1
    for y in Y:
        countY[int(y)] += 1

    result = []

    for i in range(9, -1, -1):
        cnt = min(countX[i], countY[i])
        if cnt > 0:
            result.append(str(i) * cnt)

    if not result:
        return "-1"

    answer = ''.join(result)

    if answer[0] == '0':
        return "0"

    return answer