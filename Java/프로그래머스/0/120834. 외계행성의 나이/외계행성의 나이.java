class Solution {
    public String solution(int age) {
        String age1=Integer.toString(age);
        char ch[]=new char[age1.length()];
        for(int i=0; i<age1.length() ; i++){
            ch[i]=(char)(age1.charAt(i)+49);
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}