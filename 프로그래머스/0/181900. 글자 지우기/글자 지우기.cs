using System;

class Solution {
    public string solution(string my_string, int[] indices) {
        String result = "";
        for (int i = 0; i < my_string.Length; i++) {
            bool shouldKeep = true;
            for (int index = 0; index < indices.Length; index++) {
                if (i == indices[index]) {
                    shouldKeep = false;
                    break;
                }
            }
            if (shouldKeep) {
                result = result + my_string[i];
            }
        }
        return result;
    }
}