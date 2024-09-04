class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6 ){
            for(int i = 0; i < s.length(); i++){
                try {
                    Long.parseLong(s);
                }
                catch (NumberFormatException ex) {
                    return false;
                }
            }
                return true;
        }
        else {
            return false;
        }
        
    }
}