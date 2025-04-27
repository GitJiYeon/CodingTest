class Solution {
    public int solution(String myString, String pat) {
        String replaceStr = "";
        for (char word : myString.toCharArray()){
            replaceStr += (word == 'A' ?  "B" : "A");
        }
        return replaceStr.contains(pat) ? 1 : 0;
    }
}