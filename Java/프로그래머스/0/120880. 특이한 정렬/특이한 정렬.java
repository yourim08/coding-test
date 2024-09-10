class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] minus=new int[numlist.length];
        // 차의 절댓값 배열
        for(int i=0; i<numlist.length;i++){
            if((numlist[i]-n)<0) minus[i]=-(numlist[i]-n);
            else minus[i]=numlist[i]-n;
        }
        // 정렬
       int temp=0;
		int temp1=0;
		for(int i=0; i<minus.length;i++){
			for(int j=i+1; j<minus.length;j++){
				if(minus[i]>minus[j]){
					temp=minus[i];
					minus[i]=minus[j];
					minus[j]=temp;
					temp1=numlist[i];
					numlist[i]=numlist[j];
					numlist[j]=temp1;
				}
				if(minus[i]==minus[j]) {
					if(numlist[i]<numlist[j]) {
						temp1=numlist[i];
						numlist[i]=numlist[j];
						numlist[j]=temp1;
					}
				}
			}
		}
        answer=numlist;
        return answer;
    }
}