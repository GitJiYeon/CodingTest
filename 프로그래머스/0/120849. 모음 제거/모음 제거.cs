using System;

public class Solution {
    public string solution(string my_string) {
        char[] charray = new char[my_string.Length];
        int answer = 0;
        
        for (int i = 0; i < charray.Length; i++) {
            charray[i] = my_string[i];
        }
        
        for (int i = 0; i < charray.Length; i++) {
            if (charray[i] == 'a' || charray[i] == 'e' || charray[i] == 'i' || charray[i] == 'o' || charray[i] == 'u') {
                answer++; 
            }
        }
        
        char[] answerray = new char[charray.Length - answer];
        int count = 0;
        
        for (int i = 0; i < charray.Length; i++) {
            if (charray[i] == 'a' || charray[i] == 'e' || charray[i] == 'i' || charray[i] == 'o' || charray[i] == 'u') {
                continue;
            }
            answerray[count] = charray[i];
            count++;
        }
        
        String answery = new String(answerray);
        return answery;
    }
}