class Solution {
    public int solution(String str1, String str2) {
        boolean contain = str1.contains(str2);
        if(contain){
            return 1;
        }
        else{
            return 2;
        }

    }
}