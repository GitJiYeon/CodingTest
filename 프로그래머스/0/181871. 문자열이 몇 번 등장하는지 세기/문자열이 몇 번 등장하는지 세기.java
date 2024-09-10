class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int count = 0;
        while ((count = myString.indexOf(pat, count)) != -1) {
            answer++;
            count++;
        }
        return answer;
    }
}
