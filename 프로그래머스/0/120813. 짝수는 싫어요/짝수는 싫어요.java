class Solution {
    public int[] solution(int n) {
        int count = (n + 1) / 2;
        int[] answer = new int[count];
        
        for (int i = 0, num = 1; i < count; i++, num += 2) {
            answer[i] = num;
        }
        
        return answer;
    }
}
