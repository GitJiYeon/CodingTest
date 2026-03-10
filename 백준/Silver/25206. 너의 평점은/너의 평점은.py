rating = {
    'A+':4.5, 'A0':4.0, 'B+':3.5,
    'B0':3.0, 'C+':2.5, 'C0':2.0,
    'D+':1.5, 'D0':1.0, 'F': 0.0
}
ratingSum = 0 # 학점 * 과목평점의 합
unitSum = 0 # 학점의 합
for _ in range(20):
     info = input().split()
     if info[2] != 'P':
        ratingSum += rating[info[2]] * float(info[1])
        unitSum += float(info[1])
print(ratingSum/unitSum)

