class Solution {
    public String solution(String my_string, int[] indices) {
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            boolean shouldKeep = true;
            for (int index = 0; index < indices.length; index++) {
                if (i == indices[index]) {
                    shouldKeep = false;
                    break;
                }
            }
            if (shouldKeep) {
                result = result + my_string.charAt(i);
            }
        }
        return result;
    }
}
