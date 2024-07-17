class Solution {
    public String solution(String my_string) {
        int n=0;
        int count=0;
        char[] charArray = my_string.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i]!='a' && charArray[i]!='e' &&charArray[i]!='i' && charArray[i]!='o' &&charArray[i]!='u'){
                count++;
            }
        }
        char ch[]= new char[count];
        for(int i=0; i<charArray.length;i++){
            if(charArray[i]!='a' && charArray[i]!='e' &&charArray[i]!='i' && charArray[i]!='o' &&charArray[i]!='u'){
                ch[n]=charArray[i];
                n++;
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}