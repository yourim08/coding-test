import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max=sides[1];
        int min=sides[0];
        int i=0;
        int j=1000000;
        // max가 가장 긴 변
        while(true){
            i++;
            if(max<i) break;
            if(min<=max && i<=max){
                if(min+i>max){
                    answer++;
                }
            }
        }
        // j가 가장 긴 변 
        while(true){
            j--;
            if(j<max || j<min) break;
            if(min<j && max<j){
                if(min+max>j){
                    answer++;
                }
            }
        }
        return answer;
    }
}