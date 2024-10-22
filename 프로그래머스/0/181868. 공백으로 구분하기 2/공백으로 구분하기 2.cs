using System;

public class Solution {
    public string[] solution(string my_string) {
        string[] answer = my_string.Trim().Split(new[] {' '}, StringSplitOptions.RemoveEmptyEntries);
        return answer;
    }
}