class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int index = 0;
        String str[] = new String[intStrs.length];
        for(int i = 0; i < intStrs.length; i++){
            char tempch[] = new char[l];
            for(int j = 0; j < l; j++){
                tempch[j] = intStrs[i].charAt(s+j);
            }
            str[index++] = new String(tempch);
        }
        int count = 0;
        int trueCount = 0;
        for(int i = 0; i < str.length; i++){
            if(Integer.valueOf(str[i]) > k){
                trueCount++;
            }
        }
        int answer[] = new int[trueCount];
        for (int i = 0; i < str.length; i++) {
            if (Integer.valueOf(str[i]) > k) {
                answer[count++] = Integer.valueOf(str[i]);
            }
        }

        
        return answer;
    }
}