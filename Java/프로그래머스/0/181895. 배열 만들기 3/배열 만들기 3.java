class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[(intervals[0][1]-intervals[0][0])+(intervals[1][1]-intervals[1][0])+2];
        int n=0;
        int m=0;
        for(int i=intervals[0][0]; i<=intervals[0][1];i++){
            answer[m]=arr[i];
            m++;
        }
        for(int i=intervals[1][0]; i<=intervals[1][1];i++){
            answer[m]=arr[i];
            m++;
        }
        return answer;
    }
}