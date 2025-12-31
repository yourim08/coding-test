class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int n=0;
        for(int i=0; i<picture.length; i++){
            answer[n] = "";
            for(int j=0; j<picture[i].length(); j++){
                for(int l=0; l<k; l++){
                    answer[n]+=picture[i].charAt(j); 
                }
                for(int h=1; h<k; h++){
                    answer[n+h] = answer[n];
                }
            }
            n+=k;
        }
        return answer;
    }
}