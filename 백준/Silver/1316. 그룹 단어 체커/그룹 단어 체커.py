wordCount = int(input()) #단어 갯수
GroupCount = 0
for _ in range(wordCount):
    groupWord = True
    str = input()
    wordList = []
    while(len(str) > 0):
        currentWord = str[0]
        if(currentWord not in wordList):
            wordList.append(currentWord)
            while(len(str) > 0 and str[0] == currentWord): #조건 순서 중요
                 str = str[1:]
        else:
            groupWord = False
            break
    if(groupWord):
        GroupCount += 1

print(GroupCount)



