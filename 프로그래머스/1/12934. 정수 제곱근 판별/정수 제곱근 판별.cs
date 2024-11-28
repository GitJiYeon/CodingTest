public class Solution {
    public long solution(long n) {
       for(long i = 1; i <= n; i++){
            if(i*i == n){
                long answer = (i+1)*(i+1);
                return answer;
            }
        }
        return -1;
    }
}