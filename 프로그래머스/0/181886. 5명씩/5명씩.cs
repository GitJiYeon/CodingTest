using System;

class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        if(names.Length%5 == 0){
            answer = new String[names.Length/5];
        }    
        else {
            answer = new String[names.Length/5+1];
        }
        int count = 0;
        for(int i = 0; i < answer.Length; i++){
            answer[i] = names[count];
            count += 5;
        }
        return answer;
    }
}