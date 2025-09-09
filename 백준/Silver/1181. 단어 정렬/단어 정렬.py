N = int(input())
words = {}
for _ in range(N):
    word = input()
    words[word] = len(word)

words = [[k, v] for k, v in words.items()]
#정렬 길이 → 알파벳 순
words = sorted(words, key=lambda x: (x[1], x[0]))

for word in words:
    print(word[0])

#버블정렬로 하면 시간초과
