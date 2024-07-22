class Solution {
    public String solution(String my_string) {
        char[] charray = new char[my_string.length()];
        int answer = 0;
        
        for (int i = 0; i < charray.length; i++) {
            charray[i] = my_string.charAt(i);
        }
        
        for (int i = 0; i < charray.length; i++) {
            if (charray[i] == 'a' || charray[i] == 'e' || charray[i] == 'i' || charray[i] == 'o' || charray[i] == 'u') {
                answer++; 
            }
        }
        
        char[] answerray = new char[charray.length - answer];
        int count = 0;
        
        for (int i = 0; i < charray.length; i++) {
            if (charray[i] == 'a' || charray[i] == 'e' || charray[i] == 'i' || charray[i] == 'o' || charray[i] == 'u') {
                continue;
            }
            answerray[count] = charray[i];
            count++;
        }
        
        String answery = new String(answerray);
        return answery;
    }
}
