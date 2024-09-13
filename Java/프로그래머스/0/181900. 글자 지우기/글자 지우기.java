class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char ch[] = my_string.toCharArray();
        for(int i=0; i<ch.length;i++){
            for(int a : indices){
                if(i==a) ch[i]=' ';
            }
        }
        for(int i=0; i<ch.length ; i++){
            if(ch[i]!=' ') {
                answer+=ch[i];
            }
        }
        return answer;
    }
}