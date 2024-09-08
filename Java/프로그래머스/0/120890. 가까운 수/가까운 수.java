class Solution {
    public int solution(int[] array, int n) {
        int answer=0;
        int minus[]=new int[array.length];
        for(int i=0; i<array.length;i++){
            if((array[i]-n)<0) minus[i]=-(array[i]-n);
			else minus[i]=array[i]-n;
        }
        int m=100;
		int mi=0;
		for(int i=0; i<minus.length;i++) {
			if(minus[i]<m) {
				m=minus[i];
				mi=i;
			}
			else if(minus[i]==m) {
				if(array[i]<array[mi]) {
					mi=i;
				}
			}
		}
        answer=array[mi];
        return answer;
    }
}