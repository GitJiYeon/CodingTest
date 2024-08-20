class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                String result = "";
                for (int j = 0; j < strArr[i].length(); j++) {
                    char c = strArr[i].charAt(j);
                    if (c >= 'A' && c <= 'Z') {
                        result += (char) (c + 'a' - 'A');
                    } else {
                        result += c;
                    }
                }
                strArr[i] = result;
            } else {
                String result = "";
                for (int j = 0; j < strArr[i].length(); j++) {
                    char c = strArr[i].charAt(j);
                    if (c >= 'a' && c <= 'z') {
                        result += (char) (c - ('a' - 'A'));
                    } else {
                        result += c;
                    }
                }
                strArr[i] = result;
            }
        }
        return strArr;
    }
}
