word = input()

words = []

for i in range(1, len(word)):
    for j in range(i+1, len(word)):
         newWord = word[:i][::-1] + word[i:j][::-1] + word[j:][::-1]
         words.append(newWord)

print(min(words))

