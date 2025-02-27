using System;

public class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int m=0;
        for(int i=1; i*k<=n;i++){
            if(i*k<=n) {
                answer[m]=i*k;
                m++;
            }
        }
        return answer;
    }
}