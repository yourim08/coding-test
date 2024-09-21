class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        int end = 0;
        int n=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==2) {
                start=i;
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==2){
                end=i;
            }
        }
        int[] answer = new int[end-start+1];
        if(end==0 && start==0){
            answer[0]=-1;
            return answer;
        }
        else {
            for(int i=start; i<=end; i++){
                answer[n]=arr[i];
                n++;
            }
        }
        return answer;
    }
}