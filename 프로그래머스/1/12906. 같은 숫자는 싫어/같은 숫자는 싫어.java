import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        var pre = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1){
                pre.add(arr[i]);
                break;
            }
            else if(arr[i] != arr[i+1]) {
                pre.add(arr[i]);
            }
            else {
                continue;
            }
        }
        int[] answer = new int[pre.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = pre.get(i);
        }
        return answer;
    }
}