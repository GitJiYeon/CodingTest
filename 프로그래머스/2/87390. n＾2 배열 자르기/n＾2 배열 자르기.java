class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        int count = 0;
        
        for (long i = left; i <= right; i++) {
            int garo = (int)(i / n);
            int sero = (int)(i % n);
            
            if (garo >= sero) {
                answer[count++] = garo + 1;
            } else {
                answer[count++] = sero + 1;
            }
        }
        
        return answer;
    }
}
