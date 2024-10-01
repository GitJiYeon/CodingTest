using System;

public class Solution {
    public string solution(string my_string, string letter) {
        int count = 0;
        for(int i = 0 ; i < my_string.Length; i++){
            if(my_string[i] != letter[0]){
                count++;
            }
        }
        char[] ch = new char[count];
        int index = 0;
        for(int i = 0 ; i < my_string.Length; i++){
            if(my_string[i] != letter[0]){
            ch[index++] = my_string[i];
            }
        }
        string answer = string.Concat(ch);
        return answer;
    }
}