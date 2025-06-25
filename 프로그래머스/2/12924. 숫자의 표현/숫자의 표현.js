function solution(n) {
    var answer = 1;
    for(let i = 1; i < n; i++){
        let temp = i;
        for(let j = i+1; j < n / 2 + 1; j++){
            temp += j;
            if(temp == n) {
                answer++;
                break;
            }
            if(temp > n) break;
        }
    }
    return answer;
}