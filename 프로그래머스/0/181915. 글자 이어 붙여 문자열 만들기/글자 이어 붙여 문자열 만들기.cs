using System;

public class Solution {
    public string solution(string my_string, int[] index_list) {
        char[] ch = new char[index_list.Length]; 
        
        for (int i = 0; i < index_list.Length; i++) {
            ch[i] = my_string[index_list[i]];
        }
        
        String answer = new String(ch);
        return answer;
    }
}