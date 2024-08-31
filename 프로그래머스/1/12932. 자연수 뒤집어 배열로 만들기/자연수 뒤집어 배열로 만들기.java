class Solution {
    public int[] solution(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];
        int count = 0;
        for(int i = temp.length()-1 ;i >=0; i--){
            answer[count++] = Integer.valueOf(temp.charAt(i)-'0');
        }

        return answer;
    }
}