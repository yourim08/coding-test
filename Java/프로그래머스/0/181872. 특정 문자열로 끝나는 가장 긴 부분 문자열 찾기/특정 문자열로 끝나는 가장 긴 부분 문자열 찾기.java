class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index=0;
        char ch[] = myString.toCharArray();
        char sh[] = pat.toCharArray();
        for(int i =ch.length-1; i>=0; i--){
            int m=0;
            int count=0;
            for(int j=sh.length-1; j>=0; j--){ // 1, 0
                if(ch[i-m]==sh[j]){
                    m++;
                    count++;
                }
                
            }
            if(count==sh.length && i+1<=myString.length()-1){
                index=i;
                break;
            }
            else if(count==sh.length && i+1>=myString.length()-1){
                index=i;
                break;
            }
        }
        for(int i=0; i<=index;i++){
            answer+=myString.charAt(i);
        }
        return answer;
    }
}