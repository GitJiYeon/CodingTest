class Solution {
    public int[] solution(int[] arr) {
        int fIndex = -1;
        int lIndex = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                fIndex = i;
                break;
            }
        }
        for(int i = arr.length - 1; i > lIndex; i--){
            if(arr[i] == 2){
                lIndex = i;
                break;
            }
        }
        
        int[] answer = new int[lIndex - fIndex + 1];
        if(fIndex == -1){
            answer[0] = -1;
            return answer; 
        }
        
        
        
        int index = 0;
        for(int i = fIndex; i < lIndex + 1; i++){
            answer[index++] = arr[i];
        }
        return answer;
    }
}