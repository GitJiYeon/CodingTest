userInput = input()
pair = [[], ['A','B','C'], ['D', 'E', 'F'], ['G', 'H', 'I'],
       ['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R', 'S'],
        ['T', 'U', 'V'], ['W', 'X', 'Y', 'Z']]

answer = len(userInput)
for x in userInput:
    for i in range(len(pair)):
        for j in range(len(pair[i])):
            if pair[i][j] == x:
                answer += 1+i

print(answer)