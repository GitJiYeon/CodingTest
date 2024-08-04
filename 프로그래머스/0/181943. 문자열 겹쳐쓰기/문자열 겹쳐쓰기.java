class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 문자열을 앞부분과 덮어쓸 부분, 그리고 뒷부분으로 나눔
        String answer = my_string.substring(0, s) 
                      + overwrite_string 
                      + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
