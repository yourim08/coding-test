class Solution {
    public int solution(int a, int b) {
		int answer = 2;
		int n=1;
		int m=0;
		int l=2;
		int k=5;
        int j=10;
		int flag1=0;
		int flag2=0;
        int flag3=0;
		// 최대공약수 구하기
		while (true){
			if(n>a || n>b) {
				break;
			}
			else if(a%n==0 && b%n==0) {
				m=n;
			}
			n++;
		}
		// 분모 약분
		int b1 = b/m;
        if(b1==1) answer=1;
		int b2=b1;
        int b3=b1;
		int remain1=0;
		int remain2=0;
        int remain3=0;
		// 2의 거듭제곱
		while(true){
			if(b1<l)break;
			remain1=b1;
			b1/=l;
			if(remain1%l==0) {
				if(b1==1 || b1==5) {
					flag1=1;
					break;
				}
			}
			if(remain1%l!=0) {
				flag1=0;
				break;
			}
		}
        // 5의 거듭제곱
		while(true){
			if (b2<k) break;
			remain2=b2;
			b2/=k;
			if(remain2%k==0) {
				if(b2==1 || b2==2) {
					flag2=1;
					break;
				}
			}
			if(remain2%k!=0) {
				flag2=0;
				break;
			}
		}
        // 10의 거듭제곱
        while(true){
		    if(b3<j)break;
			remain3=b3;
			b3/=j;
			if(remain3%j==0) {
				if(b3==1 || b3==2 || b3==5) {
					flag3=1;
					break;
				}
			}
			if(remain3%j!=0) {
				flag3=0;
				break;
			}
		}
		if(flag1==1 || flag2==1 || flag3==1) answer=1;
        return answer;
    }
}