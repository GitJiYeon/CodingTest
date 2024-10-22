using System;

public class Solution {
    public int solution(int a, int b) {
        String A = Convert.ToString(a);
        String B = Convert.ToString(b);
        int anum = int.Parse(A+B);
        int bnum = int.Parse(B+A);
        if(anum>bnum){
            return anum;
        }
        else{
            return bnum;
        }
    }
}