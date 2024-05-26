class Solution {
    public double solution(int[] numbers) {
        int t = 0;
        for (int number : numbers) {
            t += number;
        }
        
        int count = numbers.length;
        
        double average = (double) t / count;
        
        return average;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        
        System.out.println(sol.solution(numbers1));  
        System.out.println(sol.solution(numbers2));  
    }
}
