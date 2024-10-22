using System;

public class Solution {
    public int solution(string str1, string str2) {
        bool contain = str1.Contains(str2);
        if(contain){
            return 1;
        }
        else{
            return 2;
        }

    }
}