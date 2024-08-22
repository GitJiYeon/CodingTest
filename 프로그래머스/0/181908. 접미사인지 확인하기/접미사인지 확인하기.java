class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        if (my_string.length() < is_suffix.length()) {
            return 0;
        }
        
        for (int i = 0; i < is_suffix.length(); i++) {
            if (my_string.charAt(my_string.length() - is_suffix.length() + i) != is_suffix.charAt(i)) {
                return 0;
            }
        }
        
        return answer;
    }
}
