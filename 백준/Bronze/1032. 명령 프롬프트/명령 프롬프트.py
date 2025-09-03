n = int(input())
files = [input().strip() for _ in range(n)]

length = len(files[0])
pattern = ""

for i in range(length):
    column = [f[i] for f in files]
    if all(ch == column[0] for ch in column):
        pattern += column[0]
    else:
        pattern += "?"

print(pattern)
