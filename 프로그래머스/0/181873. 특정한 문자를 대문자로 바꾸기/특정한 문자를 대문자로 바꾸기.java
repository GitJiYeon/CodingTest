class Solution {
    public String solution(String my_string, String alp) {
        char [] ch = new char[my_string.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = my_string.charAt(i);
            if(ch[i] == alp.charAt(0)){
                ch[i] -=32;
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}