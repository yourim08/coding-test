class Solution {
    public int[] solution(int n, int m) {
        int i = 1;
        int g = 0;
        while(true){
            if(i>n || i>m){
                break;
            }
            if(n%i==0 && m%i==0){
                g = i;
                i++;
            }
            else {
                i++;
            }
        }
        int[] answer = {g, n*m/g};
        return answer;
    }
}