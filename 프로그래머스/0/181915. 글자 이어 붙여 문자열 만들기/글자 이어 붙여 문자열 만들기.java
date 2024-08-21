class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] ch = new char[index_list.length]; 
        
        for (int i = 0; i < index_list.length; i++) {
            ch[i] = my_string.charAt(index_list[i]);
        }
        
        String answer = new String(ch);
        return answer;
    }
}
