using System;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.Length];
        int n1= n-1;
        for(int i=n;i<num_list.Length ; i++){
            answer[i-n] =num_list[i];
        }
        for (int j=0; j<n; j++){
            answer[num_list.Length-1-n1]=num_list[j];
            n1--;
        }
        return answer;
    }
}