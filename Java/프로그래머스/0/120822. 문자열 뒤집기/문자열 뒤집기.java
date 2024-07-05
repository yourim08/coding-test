class Solution {
    public String solution(String my_string) {
        char ch[] = new char[my_string.length()];
        for(int i=0 ; i<ch.length ; i++){
            ch[(ch.length-1)-i]=my_string.charAt(i);
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}