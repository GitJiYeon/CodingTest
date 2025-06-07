def solution(myStr):
    for ch in "abc":
        myStr = myStr.replace(ch, " ")
    parts = [s for s in myStr.split() if s]
    return parts if parts else ["EMPTY"]