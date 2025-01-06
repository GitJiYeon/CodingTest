class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n > a-1) {
            int left = (n / a) * b;
            answer += left;
            n = left + (n % a);
        }

        return answer;
    }
}
