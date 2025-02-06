using System;

public class Solution {
    public string[] solution(string[] todo_list, bool[] finished) {
        int count=0;
        for(int i=0; i<finished.Length ; i++){
            if(!finished[i]) {
                count++;
            }
        }
        string[] answer = new string[count];
        int n=0;
        for(int i=0; i<todo_list.Length ;i++){
            if(!finished[i]) {
                answer[n] = todo_list[i];
                n++;
            }
        }
        return answer;
    }
}