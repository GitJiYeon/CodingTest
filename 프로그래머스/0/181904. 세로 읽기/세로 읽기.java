class Solution {
    public String solution(String my_string, int m, int c) {
        
        int count = 0;
        char [] ch = new char[my_string.length()/m];
        for(int i = 0; i < my_string.length(); i+=m){
            if(i+c <= my_string.length()){
                ch[count++] = my_string.charAt(i+c-1);
            }
        }
        String answer = new String(ch);
        return answer;
    }
}