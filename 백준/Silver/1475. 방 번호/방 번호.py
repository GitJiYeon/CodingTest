num = input()
count = [0]*10
for i in range(len(num)):
    count[int(num[i])] += 1
count[9] = count[6] = (count[6] + count[9] + 1) // 2
print(max(count))