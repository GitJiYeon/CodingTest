import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int [] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = num_list[i];
        }
        int[] answer = arr;
        return answer;
    }
}