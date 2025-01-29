using System;

public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int asum=0;
        int bsum=0;
        if(arr1.Length>arr2.Length) answer=1;
        else if(arr1.Length<arr2.Length) answer=-1;
        else {
            for(int a=0; a<arr1.Length; a++){
                asum+=arr1[a];
            }
            for(int b=0; b<arr2.Length; b++){
                bsum+=arr2[b];
            }
            if(asum>bsum) answer=1;
            else if(asum<bsum) answer=-1;
            else answer=0;
        }
        return answer;
        return answer;
    }
}