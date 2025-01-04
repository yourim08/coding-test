class Solution {
    public String solution(String my_string, String letter) {
        char letter1= letter.charAt(0);
        String answer = my_string.replace(Character.toString(letter1),"");
        return answer;
    }
}