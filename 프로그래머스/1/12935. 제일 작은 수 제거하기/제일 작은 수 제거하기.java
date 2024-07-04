class Solution {
    public int[] solution(int[] arr) {
        int mini = Integer.MAX_VALUE;
        int[] answer = {-1};
        if(arr.length == 1){
            return answer;
        }
        for(int i = 0; i < arr.length; i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
            
        }
        
        for(int i = 0; i < arr.length; i++){
            if(mini == arr[i]){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int [] arr2 = new int[arr.length-1];
        
      /*  for(int i = 0, j = 0; i < arr.length && j < arr2.length; i++, j++){
            if(arr[i] != Integer.MAX_VALUE){
                arr2[j] = arr[i];
            }
            else {
                j++;
            }
        }*/
        
        int arrN = 0;
        int arr2N = 0;
       while(arr2N < arr2.length){
            if(arr[arrN] != Integer.MAX_VALUE){
                arr2[arr2N] = arr[arrN];
                arr2N++;
                arrN++;
            }
            else {
                arrN++;
            }
        }
        
        answer = arr2;
        return answer;
    }
}