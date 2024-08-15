
import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] em2 = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++){
            em2[i] = emergency[i];
        }
        int[] answer = new int[emergency.length];
        int temp = 0;
        for(int i = 0; i < emergency.length; i++){
            for(int j = i+1; j < emergency.length; j++){
                if(em2[i] < em2[j]){
                    temp = em2[i];
                    em2[i] = em2[j];
                    em2[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < em2.length; i++){
            for(int j = 0; j < em2.length; j++){
                if(em2[i] == emergency[j]){
                    answer[j] = i+1;
                }
            }
        }
        return answer;
    }
}