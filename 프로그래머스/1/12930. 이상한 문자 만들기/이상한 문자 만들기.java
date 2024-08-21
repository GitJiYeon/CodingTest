class Solution {
    public String solution(String s) {
        String result = "";
        String word = "";
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                result += word + " ";
                word = "";
                index = 0;
            } else {
                if (index % 2 == 0) {
                    word += Character.toUpperCase(ch);
                } else {
                    word += Character.toLowerCase(ch);
                }
                index++;
            }
        }
        result += word;

        return result;
    }
}
