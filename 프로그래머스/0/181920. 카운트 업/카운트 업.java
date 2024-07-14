class Solution {
    public int[] solution(int start_num, int end_num) {
        int count = end_num - start_num+1;
        int[] answer = new int[count];
        int up = start_num;
        for(int i = 0; i < count; i++){
            answer[i] = up;
            up++;
        }
        return answer;
    }
}