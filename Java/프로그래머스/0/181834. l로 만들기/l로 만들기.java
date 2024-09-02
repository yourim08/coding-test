class Solution {
    public String solution(String myString) {
        String answer = "";
        char ch[] = myString.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i]<'l') ch[i]='l';
        }
        answer=String.valueOf(ch);
        return answer;
    }
}