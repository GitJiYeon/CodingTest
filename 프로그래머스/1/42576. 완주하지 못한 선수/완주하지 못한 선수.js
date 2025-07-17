function solution(participant, completion) {
    participant.sort();
    completion.sort();
    for(let i = 0; i < completion.length; i++){
        if(participant[i] != completion[i]) {
            return participant[i];
        }
    }
    return participant.pop();
}
//이거 해시문제에요.. 언젠간 해시로 다시 풀어보시길

/*큐로 구현 (개느림)
function solution(participant, completion) {
    let queue = participant;
    while(queue.length != 1){
        var temp = queue.shift();
        if(temp == completion[0]){
            completion.shift();
        }else{
            queue.push(temp);
        }
    }
    return queue[0];
}
*/
