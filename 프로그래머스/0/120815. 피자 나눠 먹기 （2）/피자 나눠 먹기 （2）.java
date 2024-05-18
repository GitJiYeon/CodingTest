class Solution {
    public int solution(int n) {
        int slicesPerPizza = 6;
        return lcm(n, slicesPerPizza) / slicesPerPizza;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(6)); 
        System.out.println(sol.solution(10));
        System.out.println(sol.solution(4)); 
    }
}
