class Solution {
    public String[] solution(String my_str, int n) {
        int leng;
        int m=0;
        int k=0;
        if(my_str.length()%n==0) leng=my_str.length()/n;
        else leng=(my_str.length()/n)+1;
        String[] answer = new String[leng];
        // 초기값 설정
        for(int i=0; i<answer.length;i++){
            answer[i]="";
        }
        int i=1;
        for(int j=0 ; j<my_str.length();j++){
            if(m==n*i) {
                k++;
                i++;
            }
            answer[k]+=my_str.charAt(m);
            m++;
        }
        return answer;
    }
}