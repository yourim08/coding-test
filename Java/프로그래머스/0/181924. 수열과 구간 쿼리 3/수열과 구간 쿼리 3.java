class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0; i<queries.length ; i++){
            temp1 = queries[i][0];
            temp2 = queries[i][1];
            temp = arr[temp1];
            arr[temp1] = arr[temp2];
            arr[temp2] = temp;
        }
        int[] answer = arr;
        return answer;
    }
}