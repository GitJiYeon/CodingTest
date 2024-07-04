class Solution {
    public long[] solution(int x, int n) {
        long [] arr = new long[n];
        long j = x;
        for(int i = 0; i < n; i++){
            arr[i] = j;
            j += x;
        }
        long[] answer = arr;
        return answer;
    }
}