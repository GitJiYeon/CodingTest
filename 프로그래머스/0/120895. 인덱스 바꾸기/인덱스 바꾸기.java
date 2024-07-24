class Solution {
    public String solution(String my_string, int num1, int num2) {
        char pneumonoultramicroscopicsilicovolcanoconiosis = 'a';
        char[] carray = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            carray[i] = my_string.charAt(i);
        }
        pneumonoultramicroscopicsilicovolcanoconiosis = carray[num1];
        carray[num1] = carray[num2];
        carray[num2] = pneumonoultramicroscopicsilicovolcanoconiosis;
        
        String answer = String.valueOf(carray);
        return answer;
    }
}