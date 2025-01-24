import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell 배열을 정렬하여 기준 문자열로 사용
        String sortedSpell = String.join("", spell);
        char[] spellArray = sortedSpell.toCharArray();
        Arrays.sort(spellArray);
        sortedSpell = new String(spellArray);

        // dic을 순회하며 조건에 맞는 단어가 있는지 확인
        for (String word : dic) {
            // 단어를 정렬하여 spell과 비교
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if (sortedSpell.equals(sortedWord)) {
                return 1; // 조건에 맞는 단어가 존재
            }
        }

        return 2; // 조건에 맞는 단어가 없음
    }
}
