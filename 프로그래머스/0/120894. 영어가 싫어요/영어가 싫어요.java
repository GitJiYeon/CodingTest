import java.util.HashMap;

class Solution {
    public long solution(String numbers) {
        HashMap<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char c : numbers.toCharArray()) {
            temp.append(c);
            if (numberMap.containsKey(temp.toString())) {
                result.append(numberMap.get(temp.toString()));
                temp.setLength(0);
            }
        }

        return Long.parseLong(result.toString());
    }
}
