class Solution {
    public int solution(String myString, String pat) {
        char[] ch = new char[myString.length()];
        for(int i = 0; i < ch.length; i++){
            if(myString.charAt(i)== 'A'){
                ch[i] = 'B';
            }
            else{
                ch[i] = 'A';
            }
        }
        String temp = new String(ch);
        boolean contain = temp.contains(pat);
        if(contain){
            return 1;
        }
        else{
            return 0;
        }
    }
}