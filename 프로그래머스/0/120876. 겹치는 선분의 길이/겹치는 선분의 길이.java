class Solution {
    public int solution(int[][] lines) {
        int count[] = new int[200];
        int answer = 0;

        for(int i=0; i<lines.length; i++){
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++){
                count[j] += 1;
            }
        }   
        
        for(int a : count){
            if(a>=2){
                answer++;
            }
        }
        return answer;
    }
}