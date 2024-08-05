class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            if (size == 0) {
                stk[size++] = arr[i];
            } else if (stk[size - 1] < arr[i]) {
                stk[size++] = arr[i];
            } else if (stk[size - 1] >= arr[i]) {
                size--;
                i--;
            }
        }

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stk[i];
        }

        return result;
    }
}
