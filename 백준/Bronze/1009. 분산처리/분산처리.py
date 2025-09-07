T = int(input())
answers = []
for _ in range(T):
    a, b = map(int, input().split())
    a %= 10 

    pattern = []
    pattern.append(a % 10)
    pattern.append((a ** 2) % 10)
    pattern.append((a ** 3) % 10)
    pattern.append((a ** 4) % 10)

    result = pattern[(b - 1) % 4]
    if result == 0:
        result = 10
    answers.append(result)

for i in range(len(answers)):
    print(answers[i])
