class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length/n;
        int[][] answer = new int[length][n];
        int count = 0;
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[i].length; j++){
                answer[i][j] = num_list[count++];
            }
        }
        return answer;
    }
}