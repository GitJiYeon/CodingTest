function solution(s){
    s = s.toLowerCase();
    var answer = true;
    var numY = 0;
    var numP = 0;
    for(let i = 0; i < s.length; i++){
        if(s[i] == 'y'){ numY++; }
        else if(s[i] == 'p'){ numP++; }
    }

    return numP == numY;
}