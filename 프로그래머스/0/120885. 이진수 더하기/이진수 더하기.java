class Solution {
    public String solution(String bin1, String bin2) {
        int tenbin1 = Integer.parseInt(bin1, 2);
        int tenbin2 = Integer.parseInt(bin2, 2);
        
        int sum = tenbin1 + tenbin2;
        
        return Integer.toBinaryString(sum);
    }
}
