using System;

class Solution {
    public String solution(String myString) {
        
        char[] ch = new char[myString.Length];
        for(int i = 0; i < myString.Length;i++){
            ch[i]= myString[i];
            if((int)ch[i] == 97){
                ch[i] = 'A';
            }
            else if((int)ch[i] != 'A' && (int)ch[i] <91 && (int)ch[i] > 64){
                ch[i] = (char)(ch[i]+32);
            }
            else{
                
            }
        }
        String answer = new String(ch);
        return answer;
    }
}