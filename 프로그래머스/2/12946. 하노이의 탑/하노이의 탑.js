function solution(n) {
    var answer = [];
    
    
    function hanoi(count, from, temp, to){
        if(count === 1) {
            answer.push([from, to]);
            return;
        }
        hanoi(count-1, from, to, temp);
        answer.push([from, to]);
        hanoi(count-1, temp, from, to);
    }
    
    hanoi(n, 1, 2, 3);
    return answer;
}