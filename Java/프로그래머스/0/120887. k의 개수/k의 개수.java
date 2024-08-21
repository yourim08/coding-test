class Solution {
    public int solution(int i, int j, int k) { 
        int answer=0; 
        int a=0; 
        String n=String.valueOf(i); // i를 문자열로 변환
        char k1=(char)(k+48);       // 48을 더해서 숫자로 만든다.
        for(int m=i; m<=j; m++){    // 12번 돌음
            n=String.valueOf(m);
            for(int l=0; l<n.length(); l++){
                if(n.charAt(l)==k1) answer++;
            }
        }
        return answer;
    }
}