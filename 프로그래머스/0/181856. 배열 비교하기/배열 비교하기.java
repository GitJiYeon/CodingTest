class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1n = 0;
        int arr2n = 0;
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                return 1;
            }
            else 
                return -1;
        }
        else if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                arr1n += arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                arr2n += arr2[i];
            }
            if(arr1n > arr2n){
                return 1;
            }
            if(arr1n < arr2n){
                return -1;
            }
            else return 0;
        }
        return answer;
    }
}