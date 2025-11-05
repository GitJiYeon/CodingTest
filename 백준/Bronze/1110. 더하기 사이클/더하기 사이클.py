num = input()
count = 0

if int(num) < 10:
    num = "0" + num
originalNum = num

while True:
    if int(num) < 10:
        num = "0" + num

    sumNum = 0
    for x in num:
        sumNum += int(x)

    newNum = num[-1] + str(sumNum % 10)
    count += 1

    num = newNum
    if newNum == originalNum:
        break

print(count)
