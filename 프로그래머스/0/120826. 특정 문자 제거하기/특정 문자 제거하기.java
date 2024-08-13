class Solution {
    public String solution(String my_string, String letter) {
        int count = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == letter.charAt(0)) {
                count++;
            }
        }

        char[] ch = new char[my_string.length() - count];
        int j = 0;

        for(int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                ch[j] = my_string.charAt(i);
                j++;
            }
        }

        String answer = new String(ch);
        return answer;
    }
}
