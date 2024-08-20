class Solution {
    public String solution(String str1, String str2) {
        char sstr1[] = new char[str1.length()];
        char sstr2[] = new char[str2.length()];
        for(int i = 0; i < sstr1.length; i++){
            sstr1[i] = str1.charAt(i);
        }
        for(int i = 0; i < sstr2.length; i++){
            sstr2[i] = str2.charAt(i);
        }
        char[] ch = new char[str1.length()+str2.length()];
        int count = 0;
        for(int i = 0; i < sstr1.length; i++){
            ch[count] = sstr1[i];
            count += 2;
        }
        count = 1;
        for(int i = 0; i < sstr2.length; i++){
            ch[count] = sstr2[i];
            count += 2;
        }
        String answer = new String(ch);
        return answer;
    }
}
