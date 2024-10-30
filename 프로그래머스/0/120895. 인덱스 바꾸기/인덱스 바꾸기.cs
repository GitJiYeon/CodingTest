using System;

public class Solution {
    public string solution(string my_string, int num1, int num2) {
        char pneumonoultramicroscopicsilicovolcanoconiosis = 'a';
        char[] carray = new char[my_string.Length];
        for(int i = 0; i < my_string.Length; i++){
            carray[i] = my_string[i];
        }
        pneumonoultramicroscopicsilicovolcanoconiosis = carray[num1];
        carray[num1] = carray[num2];
        carray[num2] = pneumonoultramicroscopicsilicovolcanoconiosis;
        
        String answer = new String(carray);
        return answer;
    }
}