function solution(array) {
   // array.sort(); //js는 문자열 기준 정렬
    array.sort((a, b) => a - b);
    return array[parseInt(array.length/2)];
}