using System;

public class Solution {
    public int solution(int n) {
       int i = 1;
        int f = 1;
        while (f <= n) {
            i++;
            f *= i;
        }
        return i - 1;
    }
}