class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char ch[] = myString.toCharArray();
        char ph[] = pat.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i]=='A') ch[i]='B';
            else if(ch[i]=='B') ch[i]='A';
        }
        for(int i=0 ;i<ch.length;i++){
            int count=0;
            for(int j=0; j<ph.length;j++){
                if(i+j<ch.length){
                    if(ch[i+j]==ph[j]) count++;
                }
                if(count==ph.length) {
                    answer=1;
                    break;
                }
            }
        }
        return answer;
    }
}