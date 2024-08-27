class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        char kChar = (char) (k + '0');
        
        for (int a = i; a <= j; a++) {
            String b = String.valueOf(a);
            for (int m = 0; m < b.length(); m++) {
                if (b.charAt(m) == kChar) {
                    count++;
                }
            }
        }
        return count;
    }
}
