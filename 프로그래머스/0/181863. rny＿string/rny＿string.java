class Solution {
    public String solution(String rny_string) {
        int mcount = 0;
        for (int i = 0; i < rny_string.length(); i++) {
            if (rny_string.charAt(i) == 'm') {
                mcount++;
            }
        }

        char[] ch = new char[rny_string.length() + mcount];
        int count = 0;
        for (int i = 0; i < rny_string.length(); i++) {
            if (rny_string.charAt(i) == 'm') {
                ch[count] = 'r';
                count++;
                ch[count] = 'n';
            } else {
                ch[count] = rny_string.charAt(i);
            }
            count++;
        }

        String answer = new String(ch);
        return answer;
    }
}
