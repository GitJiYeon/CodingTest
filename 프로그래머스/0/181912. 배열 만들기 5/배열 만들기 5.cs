using System;

public class Solution {
    public int[] solution(string[] intStrs, int k, int s, int l) {
        int index = 0;
        string[] str = new string[intStrs.Length];
        for(int i = 0; i < intStrs.Length; i++){
            char []tempch = new char[l];
            for(int j = 0; j < l; j++){
                tempch[j] = intStrs[i][s+j];
            }
            str[index++] = new String(tempch);
        }
        int count = 0;
        int trueCount = 0;
        for(int i = 0; i < str.Length; i++){
            if(Convert.ToInt32(str[i]) > k){
                trueCount++;
            }
        }
        int[] answer = new int[trueCount];
        for (int i = 0; i < str.Length; i++) {
            if (Convert.ToInt32(str[i]) > k) {
                answer[count++] = Convert.ToInt32(str[i]);
            }
        }

        
        return answer;
    }
}