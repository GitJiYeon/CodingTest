function solution(phone_number) {
    var answer = "";
    for(let i = 0; i < phone_number.length-4; i++){
        answer += '*';
    }for(let i = phone_number.length-4; i < phone_number.length; i++){
        answer += phone_number[i];
    }
    return answer;
}//이렇게 풀면 안되는것같은데