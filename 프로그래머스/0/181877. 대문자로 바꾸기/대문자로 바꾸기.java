class Solution {
    public String solution(String myString) {
        char [] ch = new char[myString.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = myString.charAt(i);
            if(ch[i] > 96){
                ch[i] -= 32;
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}