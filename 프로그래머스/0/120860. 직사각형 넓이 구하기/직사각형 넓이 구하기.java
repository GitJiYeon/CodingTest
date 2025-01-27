class Solution {
    public int solution(int[][] dots) {
        int xMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < 4; i++) {
            xMin = Math.min(xMin, dots[i][0]);
            xMax = Math.max(xMax, dots[i][0]);
            yMin = Math.min(yMin, dots[i][1]);
            yMax = Math.max(yMax, dots[i][1]);
        }

        int width = xMax - xMin;
        int height = yMax - yMin;

        return width * height;
    }
}

