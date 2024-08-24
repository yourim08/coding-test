class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int n=0;
        int m=0;
        String str[] = new String[my_string.length()];
        for(int i=0; i<str.length ; i++){
            str[i]=""; // 초기값 설정
            n+=m;
            for(int j=str.length; j>i;j--){
                str[i]+=my_string.charAt(n);
                n++;
            }
            n=0;
            m++;
        }
        for(int i=0; i<str.length;i++){
            if(str[i].equals(is_suffix)) {
                answer=1;
                break;
            }
        }
        return answer;
    }
}