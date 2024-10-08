using System;

public class Solution {
    public string solution(string n_str) {
        int count = 0;
        for (int i = 0; i < n_str.Length; i++) {
            if (n_str[i] != '0') {
                count = i;
                break;
            }
        }
        
        char[] ch = new char[n_str.Length - count];
        int c = 0;
        for (int i = 0; i < ch.Length; i++) {
            ch[i] = n_str[count++];
        }
        
        string answer = new string(ch);
        return answer;
    }
}
