function solution(dots) {
    const patturn = [
        [0, 1, 2, 3],
        [0, 2, 1, 3], 
        [0, 3, 1, 2] 
    ];
    
    for (let i = 0; i < patturn.length; i++) {
        let [a, b, c, d] = patturn[i];
        var sum1 = (dots[a][1] - dots[b][1]) / (dots[a][0] - dots[b][0]);
        var sum2 = (dots[c][1] - dots[d][1]) / (dots[c][0] - dots[d][0]);
        if (sum1 === sum2) return 1;
    }
    return 0;
}