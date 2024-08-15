class Solution {
    public String solution(String my_string) {
        char ch[]= my_string.toCharArray();
        char temp='0';
        for(int i=0; i<ch.length ;i++){
            ch[i]=Character.toLowerCase(ch[i]);
        }
        for(int i=0 ; i<ch.length-1 ;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        String answer = String.valueOf(ch);
        return answer;
    }
}