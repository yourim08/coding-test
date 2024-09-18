class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxR=-256;
        int minR=256;
        int maxC=-256;
        int minC=256;
        for(int i=0; i<dots.length ; i++){
            for(int j=0; j<dots[i].length ; j++){
                if (j==0){
                    if(dots[i][j]>maxR){
                        maxR=dots[i][j];
                    }
                    if(dots[i][j]<minR){
                        minR=dots[i][j];
                    }
                }
                if (j==1){
                    if(dots[i][j]>maxC){
                        maxC=dots[i][j];
                    }
                    if(dots[i][j]<minC){
                        minC=dots[i][j];
                    }
                }
            }
        }
        answer=(maxR-minR)*(maxC-minC);
        return answer;
    }
}