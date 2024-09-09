class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupoun=chicken;
        int sub=0;
        while(true){
            if(coupoun<10) break;
            sub+=coupoun/10;
            coupoun=coupoun%10+coupoun/10;
        } 
        answer=sub;
        return answer;
    }
}