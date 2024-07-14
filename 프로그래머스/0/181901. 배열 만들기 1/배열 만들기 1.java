class Solution {
    public int[] solution(int n, int k) {
        int count = k;
        int acount = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                acount++;
            }
        }
        int[] answer = new int[acount];
        
        acount = 0;
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                answer[acount] = i;
                acount++;
            }
        }
        return answer;
    }
}