function solution(s){
    list = [];
    for(let i = 0; i < s.length; i++){
        if(s[i] == "("){
            list.push(s[i]);
        }else{
            if (list.length === 0) return false;
            list.pop();
        }
    }
    return list.length == 0;
}