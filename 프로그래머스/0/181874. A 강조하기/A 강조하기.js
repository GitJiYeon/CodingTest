function solution(myString) {
    var answer = '';
    for(let i = 0; i < myString.length; i++){
        if(myString[i] == "A" || myString[i] == "a"){
            answer += myString[i].toUpperCase();
        }else{
            answer += myString[i].toLowerCase();
        }
    }
    return answer;
}