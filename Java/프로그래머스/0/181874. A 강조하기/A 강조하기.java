class Solution {
    public String solution(String myString) {
        char ch[]=myString.toCharArray();
        for(int i=0; i<ch.length ;i++){
            if(ch[i]=='a') ch[i]=Character.toUpperCase(ch[i]);
            else if(ch[i]>'A' && ch[i]<'Z') ch[i]=Character.toLowerCase(ch[i]);
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}