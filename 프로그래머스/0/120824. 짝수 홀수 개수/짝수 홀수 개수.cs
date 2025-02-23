using System;

public class Solution {
    public int[] solution(int[] num_list) {
        int oddcount=0;
        int evencount=0;
        for(int i=0; i<num_list.Length;i++){
            if(num_list[i]%2==0) evencount++;
            else oddcount++;
        }
        int[] answer = {evencount, oddcount};
        return answer;
    }
}