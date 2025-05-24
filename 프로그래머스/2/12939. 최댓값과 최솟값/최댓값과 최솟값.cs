using System;
public class Solution {
    public string solution(string s) {
        string[] arr = s.Split(' ');
        int min = Int32.Parse(arr[0]);
        int max = Int32.Parse(arr[0]);

        for (int i = 1; i < arr.Length; i++) {
            int num = Int32.Parse(arr[i]);
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return min.ToString() + " " + max.ToString();
    }
}
