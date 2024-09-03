class Solution {
    public int solution(String str1, String str2) {
        boolean contain = str2.contains(str1);
        if(contain){
            return 1;
        }
        else{
            return 0;
        }
    }
}