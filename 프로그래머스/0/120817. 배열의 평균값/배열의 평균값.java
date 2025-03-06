class Solution {
    public double solution(int[] numbers) {
        int A = 0;
        for (int B : numbers) {
            A += B;
        }
        int C = numbers.length;
        double D = (double) A / C;
        return D;
    }
}
