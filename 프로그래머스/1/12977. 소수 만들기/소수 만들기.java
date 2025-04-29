class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            for(int ii = i+1; ii < nums.length; ii++){
                for(int iii = ii+1; iii < nums.length; iii++){
                    int sum = (nums[i] + nums[ii] + nums[iii]);
                    if(isPrime(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }

}