using System;

public class Solution {
    public string solution(int[] numLog) {
        string answer = "";
        for(int i=0; i+1<numLog.Length;i++){
            if(numLog[i+1]==numLog[i]+1) answer+='w';
            else if(numLog[i+1]==numLog[i]-1) answer+='s';
            else if(numLog[i+1]==numLog[i]+10) answer+='d';
            else if(numLog[i+1]==numLog[i]-10) answer+='a';
        }
        return answer;
    }
}