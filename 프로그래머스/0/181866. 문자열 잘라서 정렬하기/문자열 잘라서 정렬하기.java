import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] an = myString.split("x");
        Arrays.sort(an);
        int count = 0;
        for(int i = 0; i < an.length; i++){
            if(!an[i].equals("")){
                count++;
            }
        }
        String[] answer = new String[count];
        int index = 0;
        for(int i = 0; i < an.length; i++){
            if(!an[i].equals("")){
                answer[index] = an[i];
                index++;
            }
        }
        return answer;
    }
}
