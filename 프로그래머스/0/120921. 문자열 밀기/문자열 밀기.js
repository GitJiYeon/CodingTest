function solution(A, B) {
    var answer = 0;
    let queue = A.split(""); 
    for(let i = 0; i < A.length; i++){
        if(queue.join("") == B)return answer;
        queue.unshift(queue.pop());
        answer++;
    }
    return -1;
}