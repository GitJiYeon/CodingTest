function solution(answers) {
    let onePattern = [1, 2, 3, 4, 5];
    let twoPattern = [2, 1, 2, 3, 2, 4, 2, 5];
    let threePattern = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    let oneScore = 0;
    let twoScore = 0;
    let threeScore = 0;
    
    let answer = [];
    
    for(let i = 0; i < answers.length; i++){
        if(answers[i] == onePattern[i % onePattern.length]) oneScore++;
        if(answers[i] == twoPattern[i % twoPattern.length]) twoScore++;
        if(answers[i] == threePattern[i % threePattern.length]) threeScore++;
    }
    let max = Math.max(oneScore, twoScore, threeScore);
    if(oneScore == max) answer.push(1);
    if(twoScore == max) answer.push(2);
    if(threeScore == max) answer.push(3);
    return answer;
}