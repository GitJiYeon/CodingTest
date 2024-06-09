class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            String numStr = Integer.toString(num);
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array1 = {7, 77, 17};
        System.out.println(sol.solution(array1)); 

        int[] array2 = {10, 29};
        System.out.println(sol.solution(array2)); 
    }
}
