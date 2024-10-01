class Solution {
    public int solution(int n) {
        int answer = 0;
  	    String j="2";
		int m=2;
		int num[] = new int[100];
		num[0]=1;
		for(int i=1; i<num.length ; i++){
			while(true){
				m=Integer.parseInt(j);
				if(m%3==0 || j.contains("3")){
					m++;
					j=String.valueOf(m);
				}
				else {
					num[i]=m;
					m++;
					j=String.valueOf(m);
					break;
				}
			}
		}
        answer= num[n-1];
        return answer;
    }
}