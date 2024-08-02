class Solution {
    public String solution(String cipher, int code) {
        char ch[] = cipher.toCharArray();
        char sh[] = new char[cipher.length()/code];
        int count=0;
        for(int i=0; i<ch.length;i++){
            for(int j=1;j<=ch.length/code;j++){
            if(i==(code*j)-1){
                sh[count]=ch[i]; 
                count++;
                }
            }
        }
        String answer = String.valueOf(sh);
        return answer;
    }
}