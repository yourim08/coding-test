using System;

public class Solution {
    public int[] solution(int money) {
        int i=1;
        while(true){
            if(5500*i>money){
                i-=1;
                break;
            }
            i++;
        }
        int[] answer = new int[2];
        answer[0]=i;
        answer[1]=money-5500*i;
        return answer;
    }
}