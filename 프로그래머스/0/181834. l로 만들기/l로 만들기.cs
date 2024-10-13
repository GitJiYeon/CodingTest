using System;

class Solution {
    public String solution(String myString) {
        int count = 0;
        char [] ch = new char[myString.Length];
        for(int i = 0; i < myString.Length; i++){
            if((char)myString[i] < 'l'){
                ch[i] = 'l';
            }
            else{
                ch[i] = myString[i];
            }
        }

        string answer = new String(ch);
        return answer;
    }
}