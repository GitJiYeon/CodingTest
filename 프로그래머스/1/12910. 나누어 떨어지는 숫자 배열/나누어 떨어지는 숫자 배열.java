import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                a++;
            }
        }
        if(a == 0){
            int k[] = {-1};
            return k;
        }
        int n[]= new int[a];
        int b = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                n[b] = arr[i];
                b++;
            }
        }
        Arrays.sort(n);
        int[] answer = n;

        return answer;
    }
}