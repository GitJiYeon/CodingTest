using System;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int a = 0;
        for (int i = 0; i < arr.Length; i++) {
            if (arr[i] % divisor == 0) {
                a++;
            }
        }
        
        if (a == 0) {
            return new int[] { -1 }; 
        }

        int[] n = new int[a];
        int b = 0;
        
        for (int i = 0; i < arr.Length; i++) {
            if (arr[i] % divisor == 0) {
                n[b] = arr[i];
                b++;
            }
        }

        Array.Sort(n); 
        
        return n; 
    }
}
