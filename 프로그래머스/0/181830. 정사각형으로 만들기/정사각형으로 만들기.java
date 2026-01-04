class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr[0].length;
        int col = arr.length;
        int stan = (row>col) ? row : col;
        int[][] answer = new int[stan][stan];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}