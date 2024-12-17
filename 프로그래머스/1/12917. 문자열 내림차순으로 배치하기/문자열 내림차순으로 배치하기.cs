public class Solution {
    public string solution(string s) {
        char [] ch = new char[s.Length];

        for(int i = 0; i < s.Length; i++){
            ch[i] = s[i];
        }
        char temp = 'a';
        for(int i = 0; i < s.Length; i++){
            for(int j = i+1; j < s.Length; j++){
                if(ch[i] < ch[j]){
                    temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
        
        string answer = new string(ch);
        return answer;
    }
}