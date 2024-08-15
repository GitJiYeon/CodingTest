class Solution {
    public String solution(String s) {
        if(s.length() % 2 == 0){
            char[] ch = new char[2];
                ch[0] = s.charAt(s.length()/2-1);
                ch[1] = s.charAt((s.length()/2));
            String answer = new String(ch);
            return answer;
        }
        else{
            char[] ch = new char[1];
            ch[0] = s.charAt(s.length()/2);
            String answer = new String(ch);
            return answer;
        }
        

    }
}