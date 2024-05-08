class Solution {
    public int solution(int n) {
        int answer = 0;
        for(; n > 1 ; n--){
            if(n%2 ==0){
                answer = answer + n;
            }
        }
        
        return answer;
    }
}