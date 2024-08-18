class Solution {
    public double[] solution(double numer1, double denom1, double numer2, double denom2) {
        int n=0;
        for(int i=1 ; i<=1996002 ; i++){ //최대공약수 찾기
            if((numer1*denom2+denom1*numer2)%i==0 && (denom1*denom2)%i==0)
            n=i;
        }
        double a1= (numer1*denom2+denom1*numer2)/n;// 분모
        double a2= (denom1*denom2)/n; // 분자
        double[] answer = {a1,a2};
        return answer;
    }
}