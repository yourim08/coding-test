class Solution {
    public String solution(String my_string, String letter) {
        char letter1= letter.charAt(0);
        char ch=' ';
        for(int i=0; i<my_string.length();i++){
            if((my_string.charAt(i))==(letter1))
            ch=my_string.charAt(i);
        }
        String answer = my_string.replace(Character.toString(ch),"");
        return answer;
    }
}