class Solution {
    public double solution(double num1, double num2) {
        double a = num1/num2;
        double answer = (int)(a*1000)/1;
        return answer;
    }
}