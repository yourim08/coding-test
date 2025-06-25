class Solution {
    public int solution(int n) {
        int answer = 1;
        int former = 0;
        int next = 1;
        for(int i=0; i<n-1; i++){
            answer = (next+former) % 1234567;    
            former = next;
            next = answer;
        }        
        return answer;
    }
}