class Solution {
    public String solution(int month, int day) {
        String[] weekDays = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30,
                             31, 31, 30, 31, 30, 31};

        int daysPassed = 0;
        for (int i = 0; i < month - 1; i++) {
            daysPassed += daysInMonth[i];
        }
        daysPassed += day - 1;

        return weekDays[daysPassed % 7];
    }
}
