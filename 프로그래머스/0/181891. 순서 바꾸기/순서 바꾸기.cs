using System;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.Length];
        
        for (int i = n; i < num_list.Length; i++) {
            answer[i - n] = num_list[i];
        }
        
        for (int i = 0; i < n; i++) {
            answer[num_list.Length - n + i] = num_list[i];
        }
        
        return answer;
    }
}
