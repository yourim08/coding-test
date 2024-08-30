class Solution {
    public String solution(String n_str) {
        String answer = "";
        int count=0;
        for(int i=0; i<1;i++){
            for(int j=0; j<n_str.length();j++){
            if(n_str.charAt(j)=='0') count++;
            else break;
            }
        }
        for(int i=count; i<n_str.length();i++){
            answer+=n_str.charAt(i);
        }
        return answer;
    }
}