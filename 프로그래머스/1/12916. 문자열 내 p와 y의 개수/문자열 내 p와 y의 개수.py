def solution(s):
    s = s.lower()
    numP = 0;
    numY = 0;
    for i in range(len(s)):
        if(s[i] == 'p'):
            numP += 1
        if(s[i] == 'y'):
            numY += 1
    if(numP == 0 and numY == 0):
        return True
    return numP == numY