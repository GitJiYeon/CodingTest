def solution(myString):
    return ''.join('A' if c == 'a' else c.lower() if c != 'A' else 'A' for c in myString)
