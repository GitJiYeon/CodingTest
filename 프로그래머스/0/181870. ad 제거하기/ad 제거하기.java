class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        String n = "ad";
        boolean contain = true;
        for(int i = 0; i < strArr.length; i++){
            contain = strArr[i].contains(n);
            if(contain){
                count++;
            }
        }
        String[] answer = new String[strArr.length-count];
        count = 0;
        for(int i = 0; i < strArr.length; i++){
            contain = strArr[i].contains(n);
            if(contain){
            }
            else{
                answer[count++] = strArr[i];
            }
        }
        return answer;
    }
}