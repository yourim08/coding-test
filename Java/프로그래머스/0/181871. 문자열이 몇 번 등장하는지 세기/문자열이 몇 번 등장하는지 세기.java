class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char ch[] = myString.toCharArray();
        char sh[] = pat.toCharArray();
        for(int i=0; i<ch.length-sh.length+1; i++){
            int count=0;
            for(int j=0; j<sh.length;j++){
                if(ch[i+j]==sh[j]) count++;
            }
            if(count==sh.length) answer++;
        }
        return answer;
    }
}