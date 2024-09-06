class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String ageStr = String.valueOf(age);
        
        for (int i = 0; i < ageStr.length(); i++) {
            answer.append((char) ('a' + (ageStr.charAt(i) - '0')));
        }
        
        return answer.toString();
    }
}
