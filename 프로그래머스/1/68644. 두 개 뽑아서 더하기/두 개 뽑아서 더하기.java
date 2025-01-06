import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numberList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i !=j){
                    numberList.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        for(int number : numberList){
            if(!answerList.contains(number))
                answerList.add(number);
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}