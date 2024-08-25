import java.math.BigInteger;
class Solution {
    public BigInteger solution(int balls, int share) {
        // 초기 값을 1로 설정
        BigInteger nF = BigInteger.ONE;
        BigInteger mF = BigInteger.ONE;
        BigInteger nmF = BigInteger.ONE;

        // nF = balls!
        for(int i = 2; i <= balls; i++) {
            nF = nF.multiply(BigInteger.valueOf(i));
        }

        // mF = share!
        for(int i = 2; i <= share; i++) {
            mF = mF.multiply(BigInteger.valueOf(i));
        }

        // nmF = (balls-share)!
        for(int i = 2; i <= (balls - share); i++) {
            nmF = nmF.multiply(BigInteger.valueOf(i));
        }

        // answer = nF / (nmF * mF)
        BigInteger answer = nF.divide(nmF.multiply(mF));

        return answer;
    }
}