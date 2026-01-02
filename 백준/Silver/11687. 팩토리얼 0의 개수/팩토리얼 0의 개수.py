M = int(input())

#이분 탐색
#f(x) = x!의 0 갯수
"""
x:  4  5  6  7  8  9 10
f:  0  1  1  1  1  1  2
정답이 어느 한 구간에 몰려있다는 의미이므로 이분탐색 가능

"""
#x!의 0 갯수 반환 함수
def count_zero(x):
    cnt = 0
    k = 1
    while 5**k <= x:
        cnt += x // (5**k)
        k += 1
    return cnt

left = 0
right = 5 * M
answer = -1

while left <= right:
    mid = (left + right) // 2
    z = count_zero(mid)

    if z < M:
        left = mid + 1
    elif z > M:
        right = mid - 1
    else:
        answer = mid
        right = mid - 1  # 더 작은 값 확인


print(answer)
