class Solution {
    public boolean solution(int x) {
        String temp = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < temp.length(); i++){
            sum += (int)(temp.charAt(i)-'0');
        }
        if(x % sum == 0){
            return true;
        }
        else{
            return false;
        }
    }
}