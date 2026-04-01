n, a, b = map(int, input().split())

round_count = 0

while a != b:
    a = (a + 1) // 2
    b = (b + 1) // 2
    round_count += 1

print(round_count)