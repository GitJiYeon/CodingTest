import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] charCount = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                answer += s.charAt(i);
            }
        }
        
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        
        return new String(ch);
    }
}
