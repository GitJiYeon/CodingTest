def solution(common):
    if(common[1]-common[0] == common[2]-common[1]):  # 등차수열 뺀 값이 일정
        d = common[1]-common[0]  # 공차
        return common[-1]+d
    else:
        r = common[1]//common[0]  # 공바
        return common[-1]*r