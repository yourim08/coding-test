class Solution {
    public int[] solution(int n) {
        int c=0;
        int m=0;
        for(int i=1; i<=n;i++){
            if(n%i==0) c++;
        }
        int a[]=new int[c];
        for(int i=1; i<=n; i++){
            if(n%i==0) {a[m]=i; m++;}
        }
        int[] answer = a;
        return answer;
    }
}