class Solution {
    public int[] solution(int[] numbers, String direction) {
        int first = numbers[0];
        int last = numbers[numbers.length-1];
        if(direction.equals("right")){
            for(int i = numbers.length - 1; i - 1 >= 0; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = last; 
        }
        else{
           for(int i = 0; i + 1 < numbers.length; i++){
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length - 1] = first;
        }
        return numbers;
    }
}