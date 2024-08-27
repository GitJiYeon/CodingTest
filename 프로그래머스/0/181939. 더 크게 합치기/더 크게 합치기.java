class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        int anum = Integer.valueOf(A+B);
        int bnum = Integer.valueOf(B+A);
        if(anum>bnum){
            return anum;
        }
        else{
            return bnum;
        }
    }
}