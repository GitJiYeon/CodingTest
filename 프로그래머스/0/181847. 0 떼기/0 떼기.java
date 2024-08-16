class Solution {
    public String solution(String n_str) {
        int count = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0'){
                count = i;
                break;
            }
        }
        char [] ch = new char [n_str.length()-count];
        int c = 0;
        for(int i = 0; i < ch.length; i++){
            ch[i] = n_str.charAt(count++);
        }
        String answer = new String(ch);
        return answer;
            
    }
}