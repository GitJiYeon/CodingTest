class Solution {
    public int solution(int num, int k) {
        String integer = String.valueOf(num);
        String kk = String.valueOf(k);
        for(int i = 0; i < integer.length(); i++){
            if(integer.charAt(i) == kk.charAt(0)){
                return i+1;
            }
        }
        return -1;
    }
}