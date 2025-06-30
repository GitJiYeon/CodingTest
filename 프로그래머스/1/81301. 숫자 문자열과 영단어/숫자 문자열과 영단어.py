def solution(s):
    numStr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(numStr)):
        s = s.replace(numStr[i], str(i))
    return int(s)