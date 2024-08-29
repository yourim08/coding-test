class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int m=0;
        int n=0;
        int minus[] = new int[parts.length];
        // for(int i=0; i<parts.length; i++){
        //     minus[i]=parts[i][n+1]-parts[i][n];
        // }
        for(int i=0; i<parts.length;i++){
            for(int j=parts[i][0] ; j<parts[i][1]+1;j++){
                answer+=my_strings[i].charAt(j);
            }
        }
        return answer;
    }
}