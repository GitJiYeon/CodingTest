function solution(food) {
    var answer = '';
    for(let i = 1; i <= food.length; i++){
        for(let j = 0; j < Math.floor(food[i]/2); j++){
            answer += i.toString();
        }
    }
    answer+='0';
    for(let i = food.length; i >= 0; i--){
        for(let j = 0; j < Math.floor(food[i]/2); j++){
            answer += i.toString();
        }
    }
    return answer;
}