class Solution {
    public String solution(String polynomial) {
        int coefficient = 0;
        int constant = 0;

        String[] terms = polynomial.split(" \\+ ");
        
        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    coefficient += 1;
                } else {
                    coefficient += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                constant += Integer.parseInt(term);
            }
        }

        if (coefficient == 0) return String.valueOf(constant);
        if (constant == 0) return coefficient == 1 ? "x" : coefficient + "x";
        return (coefficient == 1 ? "x" : coefficient + "x") + " + " + constant;
    }
}
