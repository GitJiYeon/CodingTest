s = input().strip()

for i in range(26):
    ch = chr(ord('a') + i)   # a ~ z
    print(s.find(ch), end=" ")
