using System;

public class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<numbers.Length; i++){
            if(sum>n) {
                answer=sum;
                break;
            } 
            else {
                sum+=numbers[i];
                answer=sum;
                }
        }
        return answer;
    }
}