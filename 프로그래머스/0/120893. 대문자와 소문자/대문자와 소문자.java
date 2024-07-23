class Solution {
    public String solution(String my_string) {
        char[] ch = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) < 91 ){
                ch[i] =(char)(my_string.charAt(i)+32);
            }
            else{
                ch[i] =(char)(my_string.charAt(i)-32);
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}