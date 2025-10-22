function solution(n) {
    for(let i = n+1; i < 1000000; i++){
        if(countBits(i) == countBits(n)){
            return i;
        }
    }
    return answer;
}

function countBits(n){
    return n.toString(2).split('1').length - 1;
}