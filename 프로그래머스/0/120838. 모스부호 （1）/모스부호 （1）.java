class Solution {
    public String solution(String letter) {
        String[] arr = letter.split(" ");
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(".-")) {
                answer += "a";
            } else if (arr[i].equals("-...")) {
                answer += "b";
            } else if (arr[i].equals("-.-.")) {
                answer += "c";
            } else if (arr[i].equals("-..")) {
                answer += "d";
            } else if (arr[i].equals(".")) {
                answer += "e";
            } else if (arr[i].equals("..-.")) {
                answer += "f";
            } else if (arr[i].equals("--.")) {
                answer += "g";
            } else if (arr[i].equals("....")) {
                answer += "h";
            } else if (arr[i].equals("..")) {
                answer += "i";
            } else if (arr[i].equals(".---")) {
                answer += "j";
            } else if (arr[i].equals("-.-")) {
                answer += "k";
            } else if (arr[i].equals(".-..")) {
                answer += "l";
            } else if (arr[i].equals("--")) {
                answer += "m";
            } else if (arr[i].equals("-.")) {
                answer += "n";
            } else if (arr[i].equals("---")) {
                answer += "o";
            } else if (arr[i].equals(".--.")) {
                answer += "p";
            } else if (arr[i].equals("--.-")) {
                answer += "q";
            } else if (arr[i].equals(".-.")) {
                answer += "r";
            } else if (arr[i].equals("...")) {
                answer += "s";
            } else if (arr[i].equals("-")) {
                answer += "t";
            } else if (arr[i].equals("..-")) {
                answer += "u";
            } else if (arr[i].equals("...-")) {
                answer += "v";
            } else if (arr[i].equals(".--")) {
                answer += "w";
            } else if (arr[i].equals("-..-")) {
                answer += "x";
            } else if (arr[i].equals("-.--")) {
                answer += "y";
            } else if (arr[i].equals("--..")) {
                answer += "z";
            }
        }

        return answer;
    }
}
