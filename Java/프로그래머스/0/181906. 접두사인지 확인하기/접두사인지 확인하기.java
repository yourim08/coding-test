class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str[]=new String[my_string.length()];
        for(int i=0; i<str.length;i++){
            str[i]=""; // 모두 빈 문자열로 초기값 설정
        }
        for(int i=0; i<str.length;i++){
            for(int j=0; j<=i; j++){
                str[i]+=my_string.charAt(j);
            }
        }
        for(int i=0 ; i<str.length ; i++){
            if(is_prefix.equals(str[i])){
                answer=1;
                break;
            }
        }
        return answer;
    }
}