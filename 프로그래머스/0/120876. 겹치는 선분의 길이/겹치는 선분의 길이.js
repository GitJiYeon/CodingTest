function solution(lines) {
    var clash = Array(201).fill(0); // -100 ~ 100 범위 음수 인덱스 접근 불가로 0~200
    var answer = 0;
    for(let i = 0; i < lines.length; i++){
        for(let j = lines[i][0]+100; j < lines[i][1]+100; j++){
            clash[j]++;
        }
    }
    for(let i = 0; i < clash.length; i++){
        if(clash[i] > 1) answer++;
    }
    return answer;
}