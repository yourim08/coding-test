class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int a=0;
        String n=String.valueOf(i); // i를 문자열로 변환
        char k1=(char)(k+48);
        for(int m=i; m<=j; m++){ //12번 돌음
            for(int l=0; l<n.length(); l++){
                if(n.charAt(l)==k1) answer++;
                }
            n=String.valueOf(m+1);
        }
        return answer;
    }
}