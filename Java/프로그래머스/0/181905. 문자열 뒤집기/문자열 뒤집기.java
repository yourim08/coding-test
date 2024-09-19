class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        int n=e;
        char ch[] = my_string.toCharArray();
        char sh[] = my_string.toCharArray(); 
        for(int i=s; i<=e; i++){
            sh[i] = ch[n];
            n--; 
        }
        answer= String.valueOf(sh);
        return answer;
    }
}