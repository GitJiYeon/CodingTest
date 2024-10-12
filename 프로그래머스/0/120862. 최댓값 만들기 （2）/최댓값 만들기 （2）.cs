using System;

class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int answer = -100000000;
        for(int i = 0; i < numbers.Length; i++){
            for(int j = i + 1; j < numbers.Length; j++){
                max = numbers[i]*numbers[j];
                if(answer < max){
                    answer = max;
                }
            }
        }
        return answer;
    }
}