class Solution {
    public String solution(String[] seoul) {
        int an = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                an = i;
            }
                
        }
        String answer = "김서방은 "+ an +"에 있다";
        return answer;
    }
}