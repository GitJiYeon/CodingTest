using System;

public class Solution {
    public int solution(int a, int b) {
        string astring = a.ToString();
        string bstring = b.ToString();
        int add = int.Parse(astring + bstring);
        
        if (add > (2 * a * b)) {
            return add;
        } else {
            return 2 * a * b;
        }
    }
}

