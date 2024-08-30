import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char bc[] = before.toCharArray();
		char ac[] = after.toCharArray();
        char temp=' ';
        char temp1=' ';
        for(int i=0; i<bc.length;i++){
            for(int j=i+1 ; j<bc.length;j++){
                if(bc[i]>bc[j]) {
                    temp=bc[i];
                    bc[i]=bc[j];
                    bc[j]=temp;
                }
                if(ac[i]>ac[j]) {
                    temp1=ac[i];
                    ac[i]=ac[j];
                    ac[j]=temp1;
                }
            }
        }
        if(Arrays.equals(bc,ac)) answer=1;
        return answer;
    }
}