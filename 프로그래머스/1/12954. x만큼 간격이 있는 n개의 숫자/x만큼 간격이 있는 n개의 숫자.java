class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<answer.length; i++){
            answer[i]=x*(long)(1+i);
        }
        return answer;
    }
}