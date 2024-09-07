import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int count1=0;
        int n=0;
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length;i++){
            int count=0;
            for(int j=0; j<ch.length;j++){
                if(ch[i]==ch[j]) count++;
            }
            if(count==1) count1++;
        }
        char sh[] = new char[count1];
        for(int i=0; i<ch.length;i++){
            int count=0;
            for(int j=0; j<ch.length;j++){
                if(ch[i]==ch[j]) count++;
            }
            if(count==1) {
                sh[n]=ch[i];
                n++;
            }
        }
        Arrays.sort(sh);
        answer=String.valueOf(sh);
        return answer;
    }
}