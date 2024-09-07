class Solution {
    public String solution(String my_string, int m, int c) {
        String parts[] = new String[my_string.length()/m];
        for(int i=0 ; i<parts.length;i++){
            parts[i]=" ";
        }
        char ch[] =my_string.toCharArray();
        String answer="";
        int n=0;
        for(int i=0; i<parts.length ;i++){
            for(int j=0 ; j<m ; j++){
                parts[i]+=ch[n];
                n++;
            }
        }
        for(int i=0; i<parts.length; i++){
            answer+=parts[i].charAt(c);
        }
        return answer;
    }
}