class Solution {
    public int solution(String myString, String pat) {

        String myString1 = myString.toLowerCase();
        String pat1 = pat.toLowerCase();
        boolean contain = myString1.contains(pat1);
        if(contain){
            return 1;
        }
        else{
            return 0;
        }

    }
}