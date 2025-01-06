import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String n1 = String.valueOf(n);
        for(int i=0; i<n1.length(); i++){
            answer+=Character.getNumericValue(n1.charAt(i));
        }
        return answer;
    }
}