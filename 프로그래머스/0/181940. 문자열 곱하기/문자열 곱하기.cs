using System;

public class Solution {
    public string solution(string my_string, int k) {
       String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}