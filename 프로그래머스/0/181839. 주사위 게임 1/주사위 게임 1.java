class Solution {
    public int solution(int a, int b) {
        if(a % 2 == 0 && b % 2 == 0 ){
            if(a-b < 0){ return (-1)*(a-b); }
            else{ return (a-b); }
        }
        else if(a % 2 == 1 && b % 2 == 1 ){
            return (a*a) + (b*b);
        }
        else{
            return 2*(a+b);
        }

    }
}