class Solution {
    public long solution(int price, int money, int count) {
        long m = (long)money;
        long answer = 0;
        for(int i = 1; i <= count; i++){
            answer += (long)price*i;
        }
        
        answer -= m;
        if(answer < 0){ return 0; }
        else{ return answer; }
    }
}