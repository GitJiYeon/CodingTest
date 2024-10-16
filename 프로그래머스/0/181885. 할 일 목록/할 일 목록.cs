using System;

class Solution {
    public String[] solution(String[] todo_list, bool[] finished) {
        int count = 0;
        for(int i = 0; i < finished.Length; i++){
            if (finished[i] == false){
                count++;
            } 
        }
        int index = 0;
        String[] answer = new String[count];
        for(int i = 0; i < todo_list.Length; i++){
            if (finished[i] == false){
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }
}