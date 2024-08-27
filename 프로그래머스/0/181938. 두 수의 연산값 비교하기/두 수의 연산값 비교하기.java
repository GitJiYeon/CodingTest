class Solution {
    public int solution(int a, int b) {
        String astring = String.valueOf(a);
        String bstring = String.valueOf(b);
        int add = Integer.valueOf(astring+bstring);
        if(add > (2*a*b)){
            return add;
        }
        else{
            return 2*a*b;
        }
    }
}