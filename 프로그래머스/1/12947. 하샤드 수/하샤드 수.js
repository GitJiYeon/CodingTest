function solution(x) {
    var temp = x.toString();
    var sum = 0;
    for(let i = 0; i < temp.length; i++){
        sum += parseInt(temp[i]);
    }
    return x % sum === 0
}