import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest1 = Math.max(sides[0], sides[1]);
        int minSides = Math.min(sides[0], sides[1]);
        int longest2 = sides[0] + sides[1];

        for (int i = longest1 - minSides; i <= longest1; i++) {
            if (i + minSides > longest1) {
                answer++;
            }
        }

        for (int i = longest1 + 1; i < longest1 + minSides; i++) {
            if (i < longest2) {
                answer++;
            }
        }

        return answer;
    }
}

