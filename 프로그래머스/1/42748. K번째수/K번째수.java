import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        String answerS = ""; 
        for (int i = 0; i < commands.length; i++) {
            int index = 0;
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp[index++] = array[j];
            }
            Arrays.sort(temp);
            answerS += temp[commands[i][2] - 1] + " ";
        }

        String[] answerSarr = answerS.trim().split(" ");
        int answerIndex = 0;
        answer = new int[answerSarr.length];
        for (int i = 0; i < answerSarr.length; i++) {
            answer[answerIndex++] = Integer.valueOf(answerSarr[i]);
        }

        return answer;
    }
}
