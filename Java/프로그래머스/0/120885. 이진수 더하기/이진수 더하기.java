import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        // int b1=Integer.parseInt(bin1);
        // int b2=Integer.parseInt(bin2);
        int b11= Integer.parseInt(bin1,2); //2->10
        int b22= Integer.parseInt(bin2,2);
        int sum = b11+b22; //10진수 합
        String answer = Integer.toBinaryString(sum);
        return answer;
    }
}