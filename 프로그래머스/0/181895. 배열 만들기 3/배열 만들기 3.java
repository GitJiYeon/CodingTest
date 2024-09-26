class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int count = 0;
        for(int i  = 0; i < intervals.length; i++){
            count += (intervals[i][1]+1 - intervals[i][0]);
        }
        int[] answer= new int[count];
        count = 0;
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j < intervals[i][1]+1; j++){
                answer[count++] = arr[j];
            }
        }
        return answer;
    }
}