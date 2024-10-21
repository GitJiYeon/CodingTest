using System;

public class Solution {
    public String solution(String my_string, int n) {
        char [] ch = new char[n];
        for(int i = 0; i < n; i++){
            ch[i] = my_string[i];
        }
        String answer = new String(ch);
        return answer;
    }
}