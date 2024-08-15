class Solution {
    public String solution(String phone_number) {
        char[] cr = new char[phone_number.length()];
        for(int i = 0; i < phone_number.length()-4;i++){
            cr[i] = '*';
        }
        for(int i = phone_number.length()-4; i < phone_number.length();i++){
            cr[i] = phone_number.charAt(i);
        }
        String answer = new String(cr);
        return answer;
    }
}