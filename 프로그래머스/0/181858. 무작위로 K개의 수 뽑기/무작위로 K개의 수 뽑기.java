import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        HashSet<Integer> set = new HashSet<>();

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) { 
                set.add(arr[i]);  
                answer[index++] = arr[i]; 
            }
            if (index == k) {
                break;  
            }
        }

        while (index < k) {
            answer[index++] = -1;
        }

        return answer;
    }
}
