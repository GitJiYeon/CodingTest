public class Solution {
    public string solution(string phone_number) {
        char[] cr = new char[phone_number.Length];
        for(int i = 0; i < phone_number.Length-4;i++){
            cr[i] = '*';
        }
        for(int i = phone_number.Length-4; i < phone_number.Length; i++){
            cr[i] = phone_number[i];
        }
        string answer = new string(cr);
        return answer;
    }
} 