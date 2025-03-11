using System;

public class Solution {
    public int solution(string binomial) {
        string [] arr = binomial.Split(' ');
        if(arr[1] == "+"){
            return int.Parse(arr[0]) + int.Parse(arr[2]);
        }
        else if(arr[1] == "-"){
            return int.Parse(arr[0]) - int.Parse(arr[2]);
        }
        else{
            return int.Parse(arr[0]) * int.Parse(arr[2]);
        }

    }
}