class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mulsum=1;
        int squaresum=0;
        for(int i=0 ;i<num_list.length;i++){
            mulsum*=num_list[i];
            squaresum+=num_list[i];
        }
        if(mulsum<squaresum*squaresum) answer=1;
        else answer=0;
        return answer;
    }
}