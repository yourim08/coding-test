import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger result=a1.add(b1);
        answer= String.valueOf(result);
        return answer;
    }
}