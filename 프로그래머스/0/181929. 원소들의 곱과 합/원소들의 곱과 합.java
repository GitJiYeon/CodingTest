class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        for (int num : num_list) {
            product *= num;
        }
        
        int sum = 0;
        for (int num : num_list) {
            sum += num;
        }
        
        int sumSquared = sum * sum;
        
        if (product < sumSquared) {
            return 1;
        } else {
            return 0;
        }
    }
}
