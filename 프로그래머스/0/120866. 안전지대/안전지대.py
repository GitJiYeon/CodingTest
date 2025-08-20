def solution(board):
    answer = 0
    newBoard = [[0 for _ in range(len(board[0]))] for _ in range(len(board))]

    for y in range(len(board)):
        for x in range(len(board[0])):
            if board[y][x] == 1:
                for i in range(-1, 2):
                    for j in range(-1, 2):
                        ny, nx = y+i, x+j
                        if 0 <= ny < len(board) and 0 <= nx < len(board[0]):
                            newBoard[ny][nx] = 1

    for y in range(len(board)):
        for x in range(len(board[0])):
            if newBoard[y][x] == 0:
                answer += 1

    return answer
