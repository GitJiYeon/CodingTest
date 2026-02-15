inputStr = input().upper()
dict = {}
for i in range(len(inputStr)):
    currentCount = dict.get(inputStr[i], 0)
    dict[inputStr[i]] = currentCount+1

max = 0
answer = 0
for key in dict:
    if dict[key] > max:
        max = dict[key]
        answer = key
    elif dict[key] == max:
        answer = '?'

print(answer)