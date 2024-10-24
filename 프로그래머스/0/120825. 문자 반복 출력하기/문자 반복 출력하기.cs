using System;

public class Solution {
    public String solution(String my_string, int n) {
        char[] ch = new char[my_string.Length*n];
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < my_string.Length; i++){
            for(int j = 0; j < n; j++){
                ch[count] = my_string[count2];
                count++;
                
            }
            count2++;
        }
        String answer = new String(ch);
        return answer;
    }
}