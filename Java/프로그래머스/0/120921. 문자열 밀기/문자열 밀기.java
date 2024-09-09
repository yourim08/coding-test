import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char cA[] = A.toCharArray();
        char cB[] = B.toCharArray();
        while(true){
            if(answer==cA.length) {
                answer=-1;   
                break;
            }
            if(Arrays.equals(cA,cB)) break;
            else {
                char temp=' ';
                for(int i=0; i<cA.length;i++){
                    temp=cA[i];
                    cA[i]=cA[cA.length-1];
                    cA[cA.length-1]=temp;
                }
            }
            answer++;
            
        }
        return answer;
    }
}