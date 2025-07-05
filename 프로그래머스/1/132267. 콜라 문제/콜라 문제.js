function solution(a, b, n) {
    let answer = 0;

    while (n >= a) {
        const exchanged = Math.floor(n / a) * b;
        answer += exchanged;
        n = exchanged + (n % a);
    }

    return answer;
}
