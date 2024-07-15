class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int mini = n + 100000;
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            temp = array[i]-n;
            if(temp < 0){
                temp *= -1;
            }
            if(mini > temp){
                mini = temp;
                answer = array[i];
            }
            else if (temp == mini && array[i] < answer) {
                answer = array[i];
            }
        }
            return answer;
    }
}