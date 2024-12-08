using System;

public class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        char kChar = (char)(k + '0');
        
        for (int a = i; a <= j; a++) {
            string b = a.ToString();
            for (int m = 0; m < b.Length; m++) {
                if (b[m] == kChar) {
                    count++;
                }
            }
        }
        return count;
    }
}
