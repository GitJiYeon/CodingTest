def solution(myString, pat):
    reStr = ""
    for i in range(len(myString)):
        reStr += "B" if myString[i] == 'A' else "A"
    if(pat in reStr):
        return 1
    else:
        return 0