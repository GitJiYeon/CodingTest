import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String temp = Integer.toString(i);
            boolean isValid = true;
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) != '5' && temp.charAt(j) != '0') {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                arrList.add(i);
            }
        }
        if (arrList.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
