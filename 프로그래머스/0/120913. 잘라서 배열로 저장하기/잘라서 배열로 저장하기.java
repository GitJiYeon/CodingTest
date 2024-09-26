class Solution {
    public String[] solution(String my_str, int n) {
        String [] arr = new String[(my_str.length() + n - 1)/n];
        int index = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            String temp = "";
            
            for (int j = 0; j < n && count < my_str.length(); j++) {
                    temp += my_str.charAt(count++);
            }
            arr[index++]= temp;
        }
        
        return arr;
    }
}