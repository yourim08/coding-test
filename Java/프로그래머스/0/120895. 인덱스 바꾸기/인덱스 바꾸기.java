class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] ch = new char[my_string.length()];
        for(int i=0; i<ch.length;i++){
            ch[i]=my_string.charAt(i);
        }
        char temp='a';
        temp=ch[num1]; // e
        ch[num1]=ch[num2];
        ch[num2]=temp;
        String answer = String.valueOf(ch);
        return answer;
    }
}