using System;

public class Solution {
    public string solution(string my_string) {
        char[] ch = new char[my_string.Length];
        for(int i = 0; i < my_string.Length; i++){
            if(my_string[i] < 91 ){
                ch[i] = (char)(my_string[i]+32);
            }
            else{
                ch[i] = (char)(my_string[i]-32);
            }
        }
        String answer = new String(ch);
        return answer;
    }
}