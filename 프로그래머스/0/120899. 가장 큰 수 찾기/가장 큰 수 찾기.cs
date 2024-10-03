using System;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        answer[0] = 0;
        for(int i = 0; i < array.Length; i++){
            if(answer[0] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}