class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int minus=0;
        int n=0;
        if(common[n+1]-common[n] == common[n+2]-common[n+1]){
            minus = common[n+1]-common[n];
            answer= common[common.length-1]+minus;
        }
        else if(common[n+1]/common[n] == common[n+2]/common[n+1]){
            int d=common[n+1]/common[n];
            answer= common[common.length-1]*d;
        }
        return answer;
    }
}