class Solution {
    public int solution(int n) {
        int answer = 0;
        int evensum = 0;
        int oddsum=0;
        for(int i=1; i<=n ; i++){
            if(i%2==0) {
                evensum+=(i*i);
                }
            if(i%2!=0) {
                oddsum+=i;
                }
        }
        if(n%2==0) answer=evensum;
        else answer=oddsum;
        return answer;
    }
}