function solution(n) {
    var arr = n.toString().split('');
    arr.sort(function(a, b) {
        return b - a;
    });
    var answer = parseInt(arr.join(''));
    return answer;

}