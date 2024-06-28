class Solution {
    public int[] solution(int money) {
        int c = 0;
        int count = 0;
        int icy = 5500;
        count = money / icy;
        c = money % icy;
        int[] answer = {count, c};
        return answer;
    }
}