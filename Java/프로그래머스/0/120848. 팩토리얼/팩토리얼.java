class Solution {
    public int solution(int n) {
        int answer = 0;
        int m=1;
        int k=1;
        int j=2;
            while(true){
            k*=j;
            if(k>n) {
                answer=(j-1);
                break;
            }
            else j++;
            }
        return answer;
    }
}