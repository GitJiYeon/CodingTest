import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
        int [] arr = new int[num_list.length-5];
        int count = 0;
        for(int i = 5; i < num_list.length; i++){
            arr[count] = num_list[i];
            count++;
        }
        int[] answer = arr;
        return answer;
        
    }
}