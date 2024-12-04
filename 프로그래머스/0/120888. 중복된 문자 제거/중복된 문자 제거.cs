using System;

public class Solution {
    public string solution(string my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.Length; i++){
            if(my_string.IndexOf(my_string[i]) == i){
                answer += my_string[i];
            }
        }
        return answer;
    }
}