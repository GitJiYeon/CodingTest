import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                count++;
            }
        }
        
        int[] numbers = new int[count];
        int index = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                numbers[index] = Character.getNumericValue(ch);
                index++;
            }
        }
        
        Arrays.sort(numbers);
        
        return numbers;
    }
}
