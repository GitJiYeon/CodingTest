class Solution {
    public String solution(String my_string, int s, int e) {
        char[] an = new char[my_string.length()];

        for(int i = 0; i < s; i++){
            an[i] = my_string.charAt(i);
        }

        int count = s;
        for(int i = e; i >= s; i--){
            an[count++] = my_string.charAt(i);
        }

        for(int i = e + 1; i < my_string.length(); i++){
            an[i] = my_string.charAt(i);
        }

        String answer = new String(an);
        return answer;
    }
}
