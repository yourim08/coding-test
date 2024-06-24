class Solution {
    public int[] solution(int n) {
        int count = 0;
        int num=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0) count++;
        }
        int answer[]=new int[count];
        for(int i=1; i*2-1<=n ; i++){
            answer[num]=i*2-1;
            num++;
        }
        return answer;
    }
}