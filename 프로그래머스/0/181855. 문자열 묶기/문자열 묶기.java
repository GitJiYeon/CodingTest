import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> lengthCount = new HashMap<>();
        
        // 각 문자열의 길이를 카운트
        for (String str : strArr) {
            int len = str.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }
        
        // 가장 큰 그룹의 크기를 찾음
        int maxCount = 0;
        for (int count : lengthCount.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}