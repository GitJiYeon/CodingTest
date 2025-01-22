class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        for (String row : picture) {
            StringBuilder enlargedRow = new StringBuilder();
            for (char c : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    enlargedRow.append(c);
                }
            }
            String enlargedString = enlargedRow.toString();
            for (int i = 0; i < k; i++) {
                answer[index++] = enlargedString;
            }
        }
        return answer;
    }
}
