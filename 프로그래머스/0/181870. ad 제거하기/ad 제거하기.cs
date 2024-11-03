using System;

public class Solution {
    public string[] solution(string[] strArr) {
        int count = 0;
        string n = "ad";
        
        for (int i = 0; i < strArr.Length; i++) {
            if (strArr[i].Contains(n)) {
                count++;
            }
        }
        
        string[] answer = new string[strArr.Length - count];
        count = 0;
        
        for (int i = 0; i < strArr.Length; i++) {
            if (!strArr[i].Contains(n)) {
                answer[count++] = strArr[i];
            }
        }
        
        return answer;
    }
}
