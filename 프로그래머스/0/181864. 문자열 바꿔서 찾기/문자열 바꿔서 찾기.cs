using System;

public class Solution {
    public int solution(string myString, string pat) {
        string replaceStr = "";
        for(int i = 0; i < myString.Length; i++){
            replaceStr += (myString[i] == 'A' ? "B" : "A");
        }
        return (replaceStr.Contains(pat) ? 1 : 0);
    }
}