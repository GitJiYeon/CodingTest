class Solution {
    public long solution(long n) {
        String tempAnswer = String.valueOf(n);
        char[] ch = tempAnswer.toCharArray();
        
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] < ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        
        String sortedStr = new String(ch);
        return Long.parseLong(sortedStr);
    }
}
