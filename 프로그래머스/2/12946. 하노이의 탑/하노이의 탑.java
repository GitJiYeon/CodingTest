class Solution {
    int[][] answer;
    int index = 0;
    public int[][] solution(int n) {
        answer = new int[(int) Math.pow(2,n)-1][2];
        
        hanoi(n,1,2,3);
        return answer;
    }

    public void hanoi(int count, int from, int temp, int to) {
        if (count == 1) {
            answer[index][0] = from;
            answer[index++][1] = to;
            return;
        }
        hanoi(count - 1, from, to, temp);
        answer[index][0] = from;
        answer[index++][1] = to;
        hanoi(count - 1, temp, from, to);
    }
}
