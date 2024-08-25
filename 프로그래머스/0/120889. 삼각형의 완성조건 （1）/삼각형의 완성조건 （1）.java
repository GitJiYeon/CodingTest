import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        if(sides[2] < sides[1]+sides[0]){
            return 1;
        }
        else{
        return 2;
       }
    }
}