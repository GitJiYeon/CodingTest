N = int(input())

player = []
for i in range(N):
    age, name = input().split()
    player.append([int(age), name])

player = sorted(player, key=lambda x:x[0])

for age, name in player:
    print(str(age)+" "+name)
