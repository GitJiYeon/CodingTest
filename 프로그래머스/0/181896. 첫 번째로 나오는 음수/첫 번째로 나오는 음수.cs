using System;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.Length; i++){
            answer = -1;
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}