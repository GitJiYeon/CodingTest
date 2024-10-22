using System;

public class Solution {
    public int solution(string str1, string str2) {
        bool contain = str2.Contains(str1);
        return contain ? 1 : 0;
    }
}