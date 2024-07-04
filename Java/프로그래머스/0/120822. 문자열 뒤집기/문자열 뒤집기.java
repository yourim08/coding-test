class Solution {
    public String solution(String my_string) {
        char sc[] = new char[my_string.length()];
        for(int i=0; i<sc.length ;i++){
            sc[(sc.length-1)-i]= my_string.charAt(i);
        }
        String answer= String.valueOf(sc);
        return answer;
    }
}