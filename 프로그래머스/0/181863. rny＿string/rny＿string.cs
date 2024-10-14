using System;

class Solution {
    public String solution(String rny_string) {
        int mcount = 0;
        for (int i = 0; i < rny_string.Length; i++) {
            if (rny_string[i] == 'm') {
                mcount++;
            }
        }

        char[] ch = new char[rny_string.Length + mcount];
        int count = 0;
        for (int i = 0; i < rny_string.Length; i++) {
            if (rny_string[i] == 'm') {
                ch[count] = 'r';
                count++;
                ch[count] = 'n';
            } else {
                ch[count] = rny_string[i];
            }
            count++;
        }

        String answer = new String(ch);
        return answer;
    }
}