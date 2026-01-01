N, M = map(int, input().split(' '))
board = [list(input().strip()) for _ in range(N)]

answer = N*M

for i in range(N-7):
    for j in range(M-7):
        temp_w = 0
        temp_b = 0
        for x in range(i, i+8):
            for y in range(j, j + 8):
                if((x + y) % 2 == 0):
                    if(board[x][y] != "W"):
                        temp_w += 1
                    if(board[x][y] != "B"):
                        temp_b += 1
                else:
                    if (board[x][y] != "B"):
                        temp_w += 1
                    if (board[x][y] != "W"):
                        temp_b += 1

        answer = min(answer, temp_w, temp_b)
print(answer)