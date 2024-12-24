import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] evtemp = new int[score.length];
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            evtemp[i] = (score[i][0] + score[i][1]) / 2;
            answer[i] = evtemp[i];
        }
        
        Arrays.sort(evtemp);
        for (int i = 0; i < evtemp.length / 2; i++) {
            int temp = evtemp[i];
            evtemp[i] = evtemp[evtemp.length - 1 - i];
            evtemp[evtemp.length - 1 - i] = temp;
        }
        
        int[] rank = new int[score.length];
        int currentRank = 1;
        
        for (int i = 0; i < evtemp.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (evtemp[i] == answer[j] && rank[j] == 0) {
                    rank[j] = currentRank;
                }
            }
            currentRank++;
        }
        
        return rank;
    }
}
