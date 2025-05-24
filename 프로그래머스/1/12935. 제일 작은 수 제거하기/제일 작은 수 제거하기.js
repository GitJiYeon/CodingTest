function solution(arr) {
    var answer = [];
    var min = arr[0];
    for(let i = 0; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    for(let i = 0; i < arr.length; i++){
        if(arr[i] != min){
            answer.push(arr[i]);
        }
    }
    return answer.length == 0 ? [-1] : answer;
}