function solution(n_str) {
    var answer = '';
    var index = 0;
    for(let i = 0; i < n_str.length; i++){
        if(n_str[i] != '0'){
            index = i;
            break;
        }
    }
    for(let i = index; i < n_str.length; i++){
        answer+= n_str[i];
    }
    return answer;
}