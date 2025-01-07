import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String n1 = String.valueOf(n);
        String n2 = "";
        char arr[] = new char[n1.length()];
        for(int i=0; i<arr.length; i++){
            arr[i]=n1.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            n2+=Character.getNumericValue(arr[arr.length-i-1]);
        }
        answer = Long.parseLong(n2);
        return answer;
    }
}