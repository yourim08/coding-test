class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int answer[];
        int m=0;
        int l=0;
        int k=0;
        if(n == 1){
            answer = new int[slicer[1]+1];
            for(int i=0;i<answer.length; i++){
                answer[i] = num_list[i];   
            }
        }
        else if(n == 2){
            answer = new int[num_list.length-slicer[0]];
            for(int i=slicer[0]; i<num_list.length; i++){
                answer[m]=num_list[i];
                m++;
            }
        }
        else if(n == 3){
            answer = new int[slicer[1]-slicer[0]+1];
            for(int i=slicer[0]; i<=slicer[1];i++){
                answer[l]=num_list[i];
                l++;
            }        
        }
        else if(n==4){
            int count = slicer[1]-slicer[0]+1;
            if(count%slicer[2]==0) {
                count/=slicer[2];
            }
            else {
                count=count/slicer[2]+1;
            }
            answer = new int[count];
            for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                answer[k]=num_list[i];
                k++;
            }
        }
        else answer = new int[0];
        return answer;
    }
}