using System;

public class Solution {
    public int solution(int num, int k) {
       string integer = num.ToString();
    string kk = k.ToString();
    
    for (int i = 0; i < integer.Length; i++)
    {
        if (integer[i] == kk[0])
        {
            return i + 1;
        }
    }
    return -1;
    }
}