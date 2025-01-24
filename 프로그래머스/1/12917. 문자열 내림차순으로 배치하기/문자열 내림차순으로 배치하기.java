import java.util.*;
class Solution {
    public String solution(String s) {
        String ch[] = new String[s.length()];
        for(int i=0; i<ch.length; i++){
            ch[i]=String.valueOf(s.charAt(i));
        }
        Arrays.sort(ch);
        String answer = "";
        for(int i=ch.length-1; i>=0; i--){
            answer+=ch[i];
        }
        return answer;
    }
}