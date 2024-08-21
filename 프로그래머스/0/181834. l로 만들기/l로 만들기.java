class Solution {
    public String solution(String myString) {
        int count = 0;
        char [] ch = new char[myString.length()];
        for(int i = 0; i < myString.length(); i++){
            if((char)myString.charAt(i) < 'l'){
                ch[i] = 'l';
            }
            else{
                ch[i] = myString.charAt(i);
            }
        }

        String answer = new String(ch);
        return answer;
    }
}