class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            if(sum>n) {
                answer=sum;
                break;
            } 
            else {
                sum+=numbers[i];
                answer=sum;
                }
        }
        return answer;
    }
}