class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        int[][] students = new int[n][2];

        for (int i = 0; i < n; i++) {
            students[i][0] = rank[i];
            students[i][1] = i;
        }

        java.util.Arrays.sort(students, java.util.Comparator.comparingInt(a -> a[0]));

        int count = 0, a = -1, b = -1, c = -1;

        for (int i = 0; i < n && count < 3; i++) {
            int index = students[i][1];
            if (attendance[index]) {
                if (count == 0) a = index;
                else if (count == 1) b = index;
                else c = index;
                count++;
            }
        }

        return 10000 * a + 100 * b + c;
    }
}
