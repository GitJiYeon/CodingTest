grid = []
for i in range(9):
    grid.append(list(map(int, input().split())))

max = -1
position = [0, 0]
for i in range(9):
    for j in range(9):
        if grid[i][j] > max:
            max = grid[i][j]
            position = [i+1, j+1]
print(max)
print(position[0], position[1])
