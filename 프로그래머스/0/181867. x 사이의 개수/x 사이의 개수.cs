using System;

class Solution {
    public int[] solution(String myString) {
        int xcount = 0;
        
        for (int i = 0; i < myString.Length; i++) {
            if (myString[i] == 'x') {
                xcount++;
            }
        }
        
        int[] answer = new int[xcount + 1];
        int count = 0;
        int index = 0;

        for (int i = 0; i < myString.Length; i++) {
            if (myString[i] == 'x') {
                answer[index] = count;
                index++;
                count = 0;
            } else {
                count++;
            }
        }
        
        answer[index] = count;

        return answer;
    }
}