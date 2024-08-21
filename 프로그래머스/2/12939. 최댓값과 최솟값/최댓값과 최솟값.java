import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String [] arr = s.split(" ");
        
        int [] nums = new int[arr.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(nums);
        
        String max = String.valueOf(nums[nums.length-1]);
        String mini = String.valueOf(nums[0]);
        
        String answer = mini + " " + max; 
        return answer;
    }
}