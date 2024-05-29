class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a > height)
                answer++;
        }

        return answer;
    }
}
