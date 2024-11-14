using System;

public class Solution {
    public int[] solution(string[] strlist) {
        int[] a = new int[strlist.Length];
        for(int i = 0; i < a.Length; i++){
            a[i] = strlist[i].Length;
        }
        return a;
    }
}