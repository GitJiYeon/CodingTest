using System;
using System.Text;

public class Solution {
    public string solution(string s) {
        StringBuilder answer = new StringBuilder();
        string[] words = s.Split(' '); // 공백을 기준으로 단어 나누기
        
        for (int i = 0; i < words.Length; i++) {
            for (int j = 0; j < words[i].Length; j++) {
                if (j % 2 == 0) {
                    answer.Append(char.ToUpper(words[i][j]));
                } else {
                    answer.Append(char.ToLower(words[i][j]));
                }
            }
            if (i < words.Length - 1) answer.Append(" ");
        }

        return answer.ToString();
    }
}
