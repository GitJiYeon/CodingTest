class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] position = {0, 0};
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String key : keyinput) {
            if (key.equals("up") && position[1] < yLimit) {
                position[1]++;
            } else if (key.equals("down") && position[1] > -yLimit) {
                position[1]--;
            } else if (key.equals("left") && position[0] > -xLimit) {
                position[0]--;
            } else if (key.equals("right") && position[0] < xLimit) {
                position[0]++;
            }
        }
        return position;
    }
}
