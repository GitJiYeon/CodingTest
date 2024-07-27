import java.util.Scanner;

public class Solution {

    public static String convertCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 'a' + 'A'));
            } else if (c >= 'A' && c <= 'Z') {
                result.append((char) (c - 'A' + 'a'));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = convertCase(input);
        System.out.println(output);
        sc.close();
    }
}
