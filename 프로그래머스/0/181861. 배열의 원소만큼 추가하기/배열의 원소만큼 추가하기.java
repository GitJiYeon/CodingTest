 class Solution {
    public int[] solution(int[] arr) {
        int arrlength = 0;
        for (int i = 0; i < arr.length; i++) {
            arrlength += arr[i];
        }
        
        int[] answer = new int[arrlength];
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[count++] = arr[i];
            }
        }
        
        return answer;
    }
}
