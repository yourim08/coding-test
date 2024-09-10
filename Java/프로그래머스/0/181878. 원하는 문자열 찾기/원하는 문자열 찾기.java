class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char ch[] = myString.toCharArray();
        char sh[] = pat.toCharArray();
        for(int i=0; i<ch.length; i++){
            int count=0;
            for(int j=0; j<sh.length; j++){
                if((i+j)==ch.length) break;
                if(ch[i+j]==Character.toUpperCase(sh[j]) 
                   || ch[i+j]==Character.toLowerCase(sh[j])){
                    count++;
                    }
            if(count==sh.length) {
                answer=1;
                break;
                }  
            }
        }
        return answer;
    }
}