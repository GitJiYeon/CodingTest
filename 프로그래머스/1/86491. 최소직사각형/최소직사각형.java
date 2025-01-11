class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            if (w < h) {
                int temp = w;
                w = h;
                h = temp;
            }
            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        // 최소 지갑 크기는 가장 큰 가로와 세로의 곱
        return maxWidth * maxHeight;
    }
}
