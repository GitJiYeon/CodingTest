function solution(num_list) {
    var answer = new Array(num_list.length);
    var index = 0;
    for(let i = num_list.length-1; i > -1; i--){
        answer[index++] = num_list[i];
    }
    return answer;
}