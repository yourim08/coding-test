class Solution {
    public String solution(String myString) {
        char ch[] = myString.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i]>=97 && ch[i]<=122)
            ch[i]= Character.toUpperCase(ch[i]);
        }
        String answer= String.valueOf(ch);
        return answer;
    }
}