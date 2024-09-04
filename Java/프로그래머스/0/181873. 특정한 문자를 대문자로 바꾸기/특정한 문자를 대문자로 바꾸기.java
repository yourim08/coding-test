class Solution {
    public String solution(String my_string, String alp) {
        char ch[] = my_string.toCharArray();
        for(int i=0; i<ch.length ;i++){
            if(ch[i]==alp.charAt(0)) ch[i]=Character.toUpperCase(ch[i]);
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}