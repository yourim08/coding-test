class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int result=0;
        int n=-100;
        int temp=0;
        while(true){
            temp=n;
            for(int i=0; i<num;i++){
                result+=n;
                n++;
            }
            n--;
            if(result==total){
                for(int i=0; i<answer.length ; i++){
                    answer[answer.length-1-i]=n;
                    n--;
                }
                break;
            }
            else {
                result=0;
                n=temp+1;
            }
        }
        return answer;
    }
}