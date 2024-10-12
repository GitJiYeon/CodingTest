using System;

class Solution {
    public String solution(String my_string) {
        char [] ch = new char[my_string.Length];
        for(int i = 0; i < my_string.Length; i++){
            if(my_string[i] < 91){
                ch[i] = (char)(my_string[i]+32);
            }
            else{
                ch[i] = my_string[i];
            }
        }
        Array.Sort(ch);
        String answer = new String(ch);
        return answer;
    }
}