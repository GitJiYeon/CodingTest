function solution(dartResult) {
    let score = [];
    let num = '';
    
    for (let i = 0; i < dartResult.length; i++) {
        let ch = dartResult[i];

        // 숫자 누적 (10 처리 위해)
        if (!isNaN(ch)) {
            num += ch;
        } else if (ch === 'S' || ch === 'D' || ch === 'T') {
            num = parseInt(num);
            if (ch === 'S') num = Math.pow(num, 1);
            if (ch === 'D') num = Math.pow(num, 2);
            if (ch === 'T') num = Math.pow(num, 3);
            score.push(num);
            num = '';
        } else if (ch === '*') {
            let len = score.length;
            if (len >= 2) score[len - 2] *= 2;
            score[len - 1] *= 2;
        } else if (ch === '#') {
            score[score.length - 1] *= -1;
        }
    }

    return score.reduce((a, b) => a + b);
}
