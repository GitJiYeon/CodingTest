using System;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.Length; i++){
            bool contains = str_list[i].Contains(ex);
            if (!contains){
                answer += str_list[i];
            }
        }
        return answer;
    }
}