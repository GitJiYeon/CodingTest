class Solution {
    public int solution(String my_string, String target) {

        boolean contain = my_string.contains(target);
        if(contain){
            return 1;
        }
        else{
            return 0;
            
        }
    }
}