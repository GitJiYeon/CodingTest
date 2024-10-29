using System;

class Solution {
    public int solution(int[] num_list) {
        int cocount = 0;
        int socount = 0;

        for (int i = 0; i < num_list.Length; i++) {
            if (num_list[i] % 2 == 0) {
                cocount++;
            } else {
                socount++;
            }
        }

        int[] co = new int[cocount];
        int[] so = new int[socount];
        int coIndex = 0;
        int soIndex = 0;

        for (int i = 0; i < num_list.Length; i++) {
            if (num_list[i] % 2 == 0) {
                co[coIndex] = num_list[i];
                coIndex++;
            } else {
                so[soIndex] = num_list[i];
                soIndex++;
            }
        }

        int intco = 0;
        int intso = 0;
        for (int i = 0; i < co.Length; i++) {
            intco = intco * 10 + co[i];
        }
        for (int i = 0; i < so.Length; i++) {
            intso = intso * 10 + so[i];
        }

        int answer = intco + intso;
        return answer;
    }
}