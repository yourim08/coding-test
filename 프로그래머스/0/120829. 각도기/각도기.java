class Solution {
    public int solution(int angle) {
        int answer = 0;
        int a = 4;
        int b = 3;
        int c = 2;
        int d = 1;
        
        if (angle==180) {
        answer=a;
        }
        
        else if (angle==90) {
        answer=c;
        }
        
        else if (angle<90){
         answer=d;
        }    
        else if (90<angle){
         answer=b;
        } 
        return answer;
    }
}