def solution(a, b):
    intA = str(a) + str(b)
    intB = 2*a*b
    if(int(intA) < int(intB)):
        return int(intB)
    else:
        return int(intA)