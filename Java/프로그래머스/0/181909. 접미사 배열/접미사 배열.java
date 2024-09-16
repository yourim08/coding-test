import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0; i<answer.length;i++){
            answer[i]="";
        }
        int n=0;
        char ch[] = my_string.toCharArray();
        for(int i=0; i<answer.length;i++){
            
            for(int j=i; j<ch.length;j++){
                answer[i]+=ch[j];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}