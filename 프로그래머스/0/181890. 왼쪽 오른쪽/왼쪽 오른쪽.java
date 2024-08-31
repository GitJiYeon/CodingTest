class Solution {
    public String[] solution(String[] str_list) {
        char temp = ' ';
        int icount = 0;

        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                temp = str_list[i].charAt(0);
                icount = i;
                break;
            }
        }

        if(temp == 'l'){
            String[] answer = new String[icount];
            for(int j = 0; j < answer.length; j++){
                answer[j] = str_list[j];
            }
            return answer;
        }

        int jcount = 0;
        if(temp == 'r'){
            String[] answer = new String[str_list.length - icount - 1];
            for(int j = icount + 1; j < str_list.length; j++){
                answer[jcount++] = str_list[j];
            }
            return answer;
        }

        return new String[0];
    }
}
