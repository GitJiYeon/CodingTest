class Solution {
    boolean solution(String s) {
        int parens = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') {
                parens++;
            } else {
                parens--;
                if(parens < 0) {
                    return false;
                }
            }
        }
        return parens == 0;
    }
}