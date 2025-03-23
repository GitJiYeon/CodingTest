using System;
using System.Linq; // LINQ

public class Solution {
    public double solution(int[] arr) {
        return arr.Any() ? arr.Average() : 0;
    }
}
