public class Solution {
    public string solution(string s) {
       if(s.Length % 2 == 0){
            char[] ch = new char[2];
                ch[0] = s[s.Length/2-1];
                ch[1] = s[s.Length/2];
            return new string(ch);
        }
        else{
            char[] ch = new char[1];
            ch[0] = s[s.Length/2];
            return new string(ch);
        }
    }
}