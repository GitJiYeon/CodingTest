class Solution {
    public String solution(String my_string) {
        char [] ch = new char[my_string.length()];
        int count = 0;
        for(int i = my_string.length()-1; i >= 0; i--){
            ch[count] = my_string.charAt(i);
            count++;
        }
        String answer = new String(ch);
        return answer;
    }
}