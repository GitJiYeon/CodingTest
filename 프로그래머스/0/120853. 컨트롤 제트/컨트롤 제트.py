def solution(s):
    sArr = s.split(" ")
    answer = 0
    stack = []
    for item in sArr:
        if item == "Z":
            if stack:
                stack.pop()
        else:
            stack.append(int(item))

    return sum(stack)
