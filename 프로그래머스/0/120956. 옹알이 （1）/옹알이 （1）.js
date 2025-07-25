function solution(babbling) {
    var answer = 0;
    let bab = ["aya", "ye", "woo", "ma"];
    for(let i = 0; i < babbling.length; i++){
        for(let j = 0; j < bab.length; j++){
            babbling[i] = babbling[i].replace(bab[j], ".");
        }
        
        var isBab = true;
        for(let j = 0; j < babbling[i].length; j++){
            if(babbling[i][j] != '.'){
                isBab = false;
            }
        }
        if(isBab){
            answer++;
        }
    }
    return answer;
}