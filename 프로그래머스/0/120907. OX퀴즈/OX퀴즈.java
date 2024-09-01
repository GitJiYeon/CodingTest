class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int A = Integer.valueOf(temp[0]);
            char B = temp[1].charAt(0);
            int C = Integer.valueOf(temp[2]);
            int result = Integer.valueOf(temp[4]);
            
            int an;
            if (B == '+') {
                an = A + C;
            } else {
                an = A - C;
            }
            
            if (an == result) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
