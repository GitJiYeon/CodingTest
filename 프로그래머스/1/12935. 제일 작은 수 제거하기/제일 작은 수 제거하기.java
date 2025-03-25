import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        if(arr.length < 2) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[count++] = arr[i];
            }
        }
        return answer;
    }
}