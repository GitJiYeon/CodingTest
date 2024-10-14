using System;

class Solution {
    public String solution(String myString) {
        char[] ch = new char[myString.Length];
        for(int i = 0; i < ch.Length; i++){
            ch[i] = myString[i];
            if(ch[i] < 91){
                ch[i] += (char)32;
            }
        }
        String answer = new String (ch);
        return answer;
    }
}