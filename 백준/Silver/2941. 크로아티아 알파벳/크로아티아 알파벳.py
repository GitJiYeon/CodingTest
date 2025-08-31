croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
word = input()
answer = 0
for i in range(len(croatia)):
    answer += word.count(croatia[i])
    word = word.replace(croatia[i], '0')
for i in range(len(word)):
    if(word[i] != '0'):
        answer += 1
print(answer)