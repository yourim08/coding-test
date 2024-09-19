import java.util.*;
class Solution {
    public String[] solution(String myString) {
        int count=0;
        int n=0;
        String[] parts = myString.split("x");
        for(int i=0; i<parts.length ; i++){
            if(parts[i].equals("")){
                count++;
            }
        }
        String answer[] = new String[parts.length-count];
        for(int i=0; i<parts.length ; i++){
            if(!parts[i].equals("")){
                answer[n]= parts[i];
                n++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}