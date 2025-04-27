function solution(myString, pat) {
    let reStr = ""
    for(let i = 0; i < myString.length; i++){
        reStr += myString[i] == 'A' ? "B" : "A";
    }
    return (reStr.includes(pat) ? 1 : 0 );
}