using System;

public class Solution {
    public int[] solution(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.Length;i++){
            sum+=arr[i];
        }
        int n=0;
        int[] answer =new int[sum];
        for(int i=0; i<arr.Length;i++){
            for(int j=0; j<arr[i] ;j++){
                answer[n]=arr[i];
                n++;
            }
        }
        return answer;
    }
}