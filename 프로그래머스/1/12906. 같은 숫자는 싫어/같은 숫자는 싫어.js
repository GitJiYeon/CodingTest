function solution(arr)
{
    let answer = [];
    let current = null;
    for(let i = 0; i < arr.length; i++){
        if(arr[i] != current) {
            answer.push(arr[i])
            current = arr[i];
        }
    }
    return answer;
}