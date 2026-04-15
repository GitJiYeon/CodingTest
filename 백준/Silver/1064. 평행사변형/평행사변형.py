import math

xA, yA, xB, yB, xC, yC = map(int, input().split())

# 벡터 AB, AC
ABx, ABy = xB - xA, yB - yA
ACx, ACy = xC - xA, yC - yA

# 일직선 체크 (외적 = 0)
if ABx * ACy == ABy * ACx:
    print(-1.0)
    exit()

# 거리 계사ㄴ
def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2)**2 + (y1 - y2)**2)

p1 = 2 * (dist(xA, yA, xB, yB) + dist(xA, yA, xC, yC))
p2 = 2 * (dist(xB, yB, xA, yA) + dist(xB, yB, xC, yC))
p3 = 2 * (dist(xC, yC, xA, yA) + dist(xC, yC, xB, yB))

lans = [p1, p2, p3]

print(max(lans) - min(lans))