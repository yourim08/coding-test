class Solution {
    public int[] solution(int[] num_list, int n) {
        int count1=0;
        int m=0;
        while(true){
            if(m*n<num_list.length){ 
                count1++;
                m++;
            }
            else break;
        }
        int[] answer =new int[count1];
        int count=0;
        for(int i=0; i<answer.length;i++){
            answer[i]=num_list[count];
            count+=n;
        }
        return answer;
    }
}