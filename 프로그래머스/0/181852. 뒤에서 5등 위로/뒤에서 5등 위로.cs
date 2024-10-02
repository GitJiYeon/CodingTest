using System;

public class Solution {
    public int[] solution(int[] num_list) {
        Array.Sort(num_list);
        int[] answer = new int[num_list.Length - 5];
        int index = 0;
        for(int i = 5; i < num_list.Length; i++){
            answer[index++] = num_list[i];
        }
        return answer;
    }
}