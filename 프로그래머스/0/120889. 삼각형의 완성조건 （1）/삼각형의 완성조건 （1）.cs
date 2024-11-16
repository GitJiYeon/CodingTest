using System;

public class Solution {
    public int solution(int[] sides) {
        Array.Sort(sides);
        int answer = 0;
        if(sides[2] < sides[1]+sides[0]){
            return 1;
        }
        else{
            return 2;
       }
    }
}