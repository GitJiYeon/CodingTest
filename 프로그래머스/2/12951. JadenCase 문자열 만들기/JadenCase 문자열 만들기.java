class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ", -1);
        String answer1 = "";

        for (int i = 0; i < answer.length; i++) {
            if (answer[i].length() > 0) {
                char firstChar = answer[i].charAt(0);
                if (firstChar >= 'a' && firstChar <= 'z') {
                    answer1 += (char)(firstChar - 32);
                } else {
                    answer1 += firstChar;
                }

                for (int j = 1; j < answer[i].length(); j++) {
                    char c = answer[i].charAt(j);
                    if (c >= 'A' && c <= 'Z') {
                        answer1 += (char)(c + 32);
                    } else {
                        answer1 += c;
                    }
                }
            }
            if (i < answer.length - 1) {
                answer1 += " ";
            }
        }

        return answer1;
    }
}
