function solution(board, moves) {
    answer = 0;
    stack = [];
    moves.forEach(pos => {
        for(let i = 0; i < board.length; i++){
            if(board[i][pos-1] !== 0){
                temp = board[i][pos-1];
                board[i][pos-1] = 0;
                if(stack[stack.length -1] === temp){
                    stack.pop();
                    answer += 2;
                }else{
                    stack.push(temp);
                }
                break;
            }
        }
    });
    return answer;
}