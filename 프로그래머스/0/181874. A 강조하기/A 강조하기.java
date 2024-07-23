class Solution {
    public String solution(String myString) {
        
        char[] ch = new char[myString.length()];
        for(int i = 0; i < myString.length();i++){
            ch[i]= myString.charAt(i);
            if((int)ch[i] == 97){
                ch[i] = 'A';
            }
            else if((int)ch[i] != 'A' && (int)ch[i] <91 && (int)ch[i] > 64){
                ch[i] = (char)(ch[i]+32);
            }
            else{
                
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}