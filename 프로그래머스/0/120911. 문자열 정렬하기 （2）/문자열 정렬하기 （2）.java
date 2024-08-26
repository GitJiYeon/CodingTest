import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        char [] ch = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) < 91){
                ch[i] = (char)(my_string.charAt(i)+32);
            }
            else{
                ch[i] = my_string.charAt(i);
            }
        }
        Arrays.sort(ch);
        String answer = new String(ch);
        return answer;
    }
}