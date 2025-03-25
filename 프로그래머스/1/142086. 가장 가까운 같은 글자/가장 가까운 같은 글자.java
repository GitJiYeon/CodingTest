class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < answer.length; i++){
            for(int j = i-1; j >= 0; j--){
                answer[i] = -1;
                if(s.charAt(i) ==  s.charAt(j)){
                    answer[i] = i - j;
                    break;
                }
            }
            answer[0] = -1;
        }
        return answer;
    }
}