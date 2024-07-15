class Solution {
    public int[] solution(int[] array) {
        int max=0;
        int maxindex=0;
        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];
                maxindex=i;
            }
        }
        int[] answer = {max,maxindex};
        return answer;
    }
}