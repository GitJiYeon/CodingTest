class Solution {
    public int[] solution(int n) {
        int temp = n;
        int count = 0;
       while(true){
           if(n % 2 == 0){
               n /= 2;
               count++;
           }
           else if(n == 1){
               break;
           }
           else if(n % 2 != 0){
               n = n*3+1;
               count++;
           }
       }
        int index = 1;
        int [] arr = new int[count+1];
        arr[0] = temp;
        while(true){
           if(temp % 2 == 0){
               temp /= 2;
               arr[index++] = temp;
           }
           else if(temp == 1){
               break;
           }
           else if(temp % 2 != 0){
               temp = temp*3+1;
               arr[index++] = temp;
           }
       }
        return arr;
    }
}