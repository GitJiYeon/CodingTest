class Solution {
    public int solution(String binomial) {
        String [] st = binomial.split(" ");
        int a = Integer.valueOf(st[0]);
        char op = st[1].charAt(0);
        int b = Integer.valueOf(st[2]);
        switch(op){
            case '+' : return (a + b);
 
            case '-' : return (a - b);

            case '*' : return (a * b);

        }
        return 1;
    }
}