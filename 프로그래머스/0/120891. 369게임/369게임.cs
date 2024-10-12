using System;

public class Solution {
    public int solution(int order) {
        int clapCount = 0;
        string strOrder =order.ToString();

        for (int i = 0; i < strOrder.Length; i++) {
            char digit = strOrder[i];
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }
}