class Solution {
    public int[] solution(int[][] score) {
        int[] average= new int[score.length];
        // 평균 배열
        for(int i=0; i<score.length;i++){
            average[i]=score[i][0]+score[i][1];
        }
        //등수 매기기
        int rank[] = new int[average.length];
        for(int i=0; i<rank.length ; i++){
            rank[i]=rank.length+1;
        }
        for(int i=0; i<average.length;i++){
            for(int k=0;k<average.length;k++){
                if(average[i]>=average[k]) {
                    rank[i]--;
                }
            }
        }
        int answer[]=rank;
        return answer;
    }
}