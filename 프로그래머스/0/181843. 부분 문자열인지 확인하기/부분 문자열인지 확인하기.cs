using System;

public class Solution {
    public int solution(string my_string, string target) {
        bool contain = my_string.Contains(target);
        return contain ? 1 : 0;
    }
}