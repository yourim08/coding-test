using System;

public class Solution {
    public int solution(int n, int t) {
        int answer = 0; // 1,4  2,8  3,16
        for(int i=0 ; i<t; i++){
            n=(n*2); // n=4, 
            answer=n;
        }
        return answer;
    }
}