using System;

public class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int newService = coupons / 10; 
            answer += newService;      
            coupons = coupons % 10 + newService; 
        }

        return answer;
    }
}