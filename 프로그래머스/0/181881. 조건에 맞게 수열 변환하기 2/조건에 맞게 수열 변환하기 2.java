class Solution {
    public int solution(int[] arr) {
        int n = arr.length;
        int iterations = 0;
        
        while (true) {
            boolean changed = false;
            int[] newArr = new int[n];
            
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    newArr[i] = arr[i] * 2 + 1;
                } else {
                    newArr[i] = arr[i];
                }
                
                if (newArr[i] != arr[i]) {
                    changed = true;
                }
            }
            
            if (!changed) {
                break;
            }
            
            arr = newArr;
            iterations++;
        }
        
        return iterations;
    }
}
