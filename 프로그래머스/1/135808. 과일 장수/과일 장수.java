import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> appleList = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            appleList.add(score[i]);
        }
        Collections.sort(appleList);
        for(int i = appleList.size()-m; i >= 0 ; i -= m){
            answer += (appleList.get(i) * m);
        }
        return answer;
    }
}