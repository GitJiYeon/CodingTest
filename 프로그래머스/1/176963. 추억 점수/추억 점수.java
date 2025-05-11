import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> score = new HashMap<String, Integer>();

        for(int i = 0; i < name.length; i++){
            score.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            int sumTemp = 0;
            for(int j = 0; j < photo[i].length; j++){
                sumTemp += score.getOrDefault(photo[i][j], 0);
            }
            answer[i] = sumTemp;
        }

        return answer;
    }
}
