class Solution {
    public int[] solution(int n) {
                int count1=0;
        int count3=0;
        int k=0;
        int l=0;
        for(int i=2; i<=n ; i++){
            int count=0;
            for(int j=2; j<=i; j++){
                if(i%j==0) count++;
            }
            if(count==1) count1++;
        }
        int m[] = new int[count1];
        for(int i=2; i<=n ; i++){
            int count2=0;
            for(int j=2; j<=i; j++){
                if(i%j==0) count2++;
            }
            if(count2==1) {
                m[k]=i;
                k++;
            }
        }
        for(int i=0; i<m.length;i++){
            if(n%m[i]==0) count3++;
        }
        int[] answer = new int[count3];
        for(int i=0; i<m.length;i++){
            if(n%m[i]==0){
                answer[l]=m[i];
                l++;
            }
        }
        return answer;
    }
}