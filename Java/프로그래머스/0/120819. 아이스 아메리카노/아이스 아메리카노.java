class Solution {
    public int[] solution(int money) {
        int change = 0;
        int n = 0;
        int i=1;
        while(true) {
        if(money-(i*5500)<0) {
            change = (money-(i-1)*5500);
            n=(i-1); 
            break;
            }
        else i++;
        }
        int[] answer = {n,change};
        return answer;
    }
}