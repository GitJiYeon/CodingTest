class Solution {
    public String solution(int n) {
        char [] ch = new char[n];
        for(int i = 0; i < n; i+=2){
            ch[i] = '수';
            
        }
        for(int i = 1; i < n; i+=2){
            ch[i] = '박';
            
        }
        String answer = new String(ch);
        return answer;
    }
}