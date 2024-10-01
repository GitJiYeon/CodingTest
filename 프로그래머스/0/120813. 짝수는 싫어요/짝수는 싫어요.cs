using System;

public class Solution {
    public int[] solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i+=2){
            count++;
        }
        int[] answer = new int[count];
        count = 0;
        for(int i = 1; i <= n; i+=2){
            answer[count++] = i;
        }
        return answer;
    }
}