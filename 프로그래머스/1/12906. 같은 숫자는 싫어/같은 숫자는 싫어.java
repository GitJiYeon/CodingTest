import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> numList = new ArrayList<>();
        
        numList.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                numList.add(arr[i]);
            }
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}
