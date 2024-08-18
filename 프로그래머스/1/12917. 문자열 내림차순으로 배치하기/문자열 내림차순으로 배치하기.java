class Solution {
    public String solution(String s) {
        char [] ch = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            ch[i] = s.charAt(i);
        }
        char temp = 'a';
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                if(ch[i] < ch[j]){
                    temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
        
        String answer = new String(ch);
        return answer;
    }
}