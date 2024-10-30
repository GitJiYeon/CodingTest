using System;

public class Solution {
    public int[] solution(int[] num_list) {
        int count = 0;
        int []answer = new int[num_list.Length];
        for(int i = num_list.Length-1; i >= 0; i--){
            answer[i] = num_list[count];
            count++;
        }
        return answer;
    }
}