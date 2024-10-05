using System;

public class Solution {
    public int solution(string my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.Length; i++){
            char a = my_string[i];
            if(a >= '0' && a <= '9'){
                answer += a-'0';
            }
        }
        
        return answer;
    }
}