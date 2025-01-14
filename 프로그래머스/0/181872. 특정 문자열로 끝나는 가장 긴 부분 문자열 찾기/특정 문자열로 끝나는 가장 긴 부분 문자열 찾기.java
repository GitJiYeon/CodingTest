class Solution {
    public String solution(String myString, String pat) {

        int myStringLength = myString.length();
        int patLength = pat.length();
        
        for (int i = myStringLength; i >= patLength; i--) {
            if (myString.substring(i - patLength, i).equals(pat)) {
                return myString.substring(0, i);
            }
        }
        
        return "";
    }
}
