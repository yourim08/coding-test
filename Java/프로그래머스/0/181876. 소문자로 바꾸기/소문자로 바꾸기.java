class Solution {
    public String solution(String myString) {
        char ch[] = myString.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90)
            ch[i]= Character.toLowerCase(ch[i]);
        }
        String answer= String.valueOf(ch);
        return answer;
    }
}