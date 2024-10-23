using System;

public class Solution {
    public int solution(string myString, string pat) {
        String myString1 = myString.ToLower();
        String pat1 = pat.ToLower();
        bool contain = myString1.Contains(pat1);
        return contain ? 1 : 0;
    }
}