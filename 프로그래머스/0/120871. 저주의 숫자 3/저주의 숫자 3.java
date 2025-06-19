class Solution {
    public int solution(int n) {
        int count = 0;
        int currentNum = 0;
        while(count < n){
            currentNum++;
            if(currentNum % 3 == 0 || String.valueOf(currentNum).contains("3")){
                continue;
            }
               count++;
        }
        return currentNum;
    }
}