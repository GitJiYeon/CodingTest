public class Solution {
    public int[] solution(int[] arr) {
        if (arr.Length == 1) {
            return new int[] { -1 };
        }

        int mini = arr[0];
        int miniIndex = 0;

        for (int i = 1; i < arr.Length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
                miniIndex = i;
            }
        }

        int[] answer = new int[arr.Length - 1];
        int index = 0;
        for (int i = 0; i < arr.Length; i++) {
            if (i != miniIndex) {  
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}
