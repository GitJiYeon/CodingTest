import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!primeFactors.contains(i)) {
                    primeFactors.add(i);
                }
                n /= i;
            }
        }
        return primeFactors.stream().mapToInt(i -> i).toArray();
    }
}
