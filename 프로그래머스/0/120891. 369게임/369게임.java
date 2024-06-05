public class Solution {
    public int solution(int order) {
        int clapCount = 0;
        String strOrder = String.valueOf(order);

        for (int i = 0; i < strOrder.length(); i++) {
            char digit = strOrder.charAt(i);
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }
}