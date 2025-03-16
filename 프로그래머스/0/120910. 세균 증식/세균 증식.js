function solution(n, t) {
    a = 1;
    for(let i = 1; i <= t; i++){
        a = a*2
        answer = n*a
    }
    return answer;
}