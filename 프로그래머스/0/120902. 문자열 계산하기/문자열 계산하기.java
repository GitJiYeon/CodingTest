class Solution {
    public int solution(String my_string) {
        String[] st = my_string.split(" ");
        int answer = Integer.valueOf(st[0]);
        for(int i = 1; i < st.length; i+=2){
            char c = st[i].charAt(0);
            switch(c){
                case '+' : answer += Integer.valueOf(st[i+1]); break;
                case '-' : answer -= Integer.valueOf(st[i+1]); break;
            }
            
        }
        return answer;
    }
}