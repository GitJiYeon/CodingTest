import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        String sortedBefore = new String(beforeArray);
        String sortedAfter = new String(afterArray);

        if (sortedBefore.equals(sortedAfter)) {
            return 1;
        } else {
            return 0;
        }
    }
}
