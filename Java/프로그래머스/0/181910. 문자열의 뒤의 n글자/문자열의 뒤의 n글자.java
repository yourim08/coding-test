class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int min = (my_string.length()-n); 
        for(int i=0 ; i<n;i++){
            answer+=my_string.charAt(min+i);
        }
        return answer;
    }
}