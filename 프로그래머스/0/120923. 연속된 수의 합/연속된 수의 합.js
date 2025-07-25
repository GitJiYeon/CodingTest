function solution(num, total) {
    let answer = [];
    for(let i = -1000; i <= 1000; i++){ //-2, -1, 0, 1, 2 total이 0일때 반례
        var sum = 0;
        for(let j = i; j < i + num; j++){
            sum+= j;
        }
        if(sum == total){
            for(let k = 0; k < num; k++){
                answer.push(k + i);
            }
            
            return answer;
        }
    }
}