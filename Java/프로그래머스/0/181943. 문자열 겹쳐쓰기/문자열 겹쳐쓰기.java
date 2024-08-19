class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char ch[] = my_string.toCharArray();
        char sh[] = overwrite_string.toCharArray();
        int n=0;
        for(int i=s ; i<s+sh.length;i++){
            ch[i]=sh[n];
            n++;
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}