import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int tempNum = nums.length / 2;
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> countList = new ArrayList<>();
        
        for (int temp : nums) {
            if (!numList.contains(temp)) {
                numList.add(temp);
                countList.add(1);
            } else {
                for (int i = 0; i < numList.size(); i++) {
                    if (numList.get(i) == temp) {
                        countList.set(i, countList.get(i) + 1);
                        break;
                    }
                }
            }
        }

        int max = 0;
        int currentSum = 0;
        for (int i = 0; i < countList.size(); i++) {
            currentSum++;
            if (currentSum <= tempNum) {
                max++;
            } else {
                break;
            }
        }

        return max;
    }
}
