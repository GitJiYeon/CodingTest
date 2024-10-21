using System;

class Solution {
    public String solution(String my_string, int n) {
        char[] ch = new char[n];
        for(int i = 0, j = my_string.Length-n; i < n; i++, j++){
            ch[i] = my_string[j];
        }
        String answer = new String(ch);
        return answer;
    }
}