using System;

public class Solution {
    public String solution(String my_string) {
        char [] ch = new char[my_string.Length];
        int count = 0;
        for(int i = my_string.Length-1; i >= 0; i--){
            ch[count] = my_string[i];
            count++;
        }
        String answer = new String(ch);
        return answer;
    }
}