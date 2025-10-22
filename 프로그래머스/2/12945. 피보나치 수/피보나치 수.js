function solution(n) {
    
    return fibonacci(n);
}

function fibonacci(n){ //역순(시간 단축)
    
    f0 = 0;
    f1 = 1;
    f2 = 1;
    
    for(let i = 1; i < n; i++){
        f2 = (f1+f0) % 1234567;
        f0 = f1;
        f1 = f2;
    }
    return f2;
}