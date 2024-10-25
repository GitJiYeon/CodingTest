using System;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.Length+1];
        
        for(int i = 0; i < answer.Length; i++){
            if(i == answer.Length-1){
                if(answer[i-1] > answer[i-2]){
                    answer[i] = (answer[i-1]- answer[i-2]);
                    
                    return answer;
                }
                else if(answer[i-2] >= answer[i-1]){
                    answer[i] = (answer[i-1]*2);
                    return answer;
                }
            }
            answer[i] = num_list[i];
        }
        return answer;
    }
}