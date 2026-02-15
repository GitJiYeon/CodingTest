arr = []
while(True):
    temp = input()
    if temp == '0' :
        break
    arr.append(temp)
for n in arr:
    if(n == n[::-1]):
        print('yes')
    else:
        print('no')