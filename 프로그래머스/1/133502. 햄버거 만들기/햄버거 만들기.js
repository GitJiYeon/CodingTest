function solution(ingredient) {
    var answer = 0;
    var stack = [];
    //pattern 1, 2, 3, 1
    for(let i = 0; i < ingredient.length; i++){
        stack.push(ingredient[i]);
        
        if(stack.length >= 4){
            var len = stack.length;
            if(
                stack[len - 1] == 1 &&
                stack[len - 2] == 3 &&
                stack[len - 3] == 2 &&
                stack[len - 4] == 1
            ){
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }
        }
    }
    return answer;
}