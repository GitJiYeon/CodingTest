import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int[][] temp = new int[array.length][2];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            boolean find = false;
            for (int j = 0; j < index; j++) {
                if (temp[j][0] == array[i]) {
                    temp[j][1]++;
                    find = true;
                    break;
                }
            }
            if (!find) {
                temp[index][0] = array[i];
                temp[index][1] = 1;
                index++;
            }
        }

        int max = 0;
        int indexNum = 0;
        boolean same = false;
        for (int i = 0; i < index; i++) {
            if (temp[i][1] > max) {
                max = temp[i][1];
                indexNum = temp[i][0];
                same = false;
            } else if (temp[i][1] == max) {
                same = true;
            }
        }

        if (same) {
            return -1;
        }
        return indexNum;
    }
}
