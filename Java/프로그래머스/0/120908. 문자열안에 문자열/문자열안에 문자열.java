class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        char ch[] = str1.toCharArray();
        char sh[] = str2.toCharArray();
        for(int i=0; i<=ch.length-sh.length;i++){
             boolean match=true;
            for(int j=0; j<sh.length;j++){
                if(ch[i+j]!=sh[j]) {
                    match=false;
                    break;
                    }
                }
        if(match){
            answer=1;
            break;
            }
        }
        return answer;
    }
}