function solution(s) {
    let numStr = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
    for(let i = 0; i < numStr.length; i++){
        s = s.replaceAll(numStr[i], i.toString());
    }
    return parseInt(s);
}