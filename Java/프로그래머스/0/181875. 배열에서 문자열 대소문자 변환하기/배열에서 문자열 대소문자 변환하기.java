class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0 ; i<answer.length; i++){
            answer[i]="";
        }
        for(int i=0; i<answer.length;i++){
            char ch[] = strArr[i].toCharArray();
            for(int j=0 ; j<ch.length ;j++){
                if(i%2==0) {
                    answer[i]+=Character.toLowerCase(ch[j]);
                }
                else {
                    answer[i]+=Character.toUpperCase(ch[j]);
                }
            }
        }
        return answer;
    }
}