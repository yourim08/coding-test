class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int n=0;
        for(int i=0; i<queries.length; i++){
            int min=1000000;
            int k=queries[i][2];
            for(int j=0; j<arr.length;j++){
                if(j>=queries[i][0] && j<=queries[i][1]){
                    if(arr[j]>k){
                        if(arr[j]<min){
                            min=arr[j];
                        }
                    }
                }
            }
            if(min!= 1000000){
                answer[n]=min;
                n++;
            }
            else {
                answer[n]=-1;
                n++;
            }
        }
        return answer;
    }
}