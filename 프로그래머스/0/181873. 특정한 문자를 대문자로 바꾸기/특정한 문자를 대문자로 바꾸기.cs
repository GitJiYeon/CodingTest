using System;

class Solution {
    public String solution(String my_string, String alp) {
        char [] ch = new char[my_string.Length];
        for(int i = 0; i < ch.Length; i++){
            ch[i] = my_string[i];
            if(ch[i] == alp[0]){
                ch[i] -=(char)32;
            }
        }
        String answer = new String(ch);
        return answer;
    }
}