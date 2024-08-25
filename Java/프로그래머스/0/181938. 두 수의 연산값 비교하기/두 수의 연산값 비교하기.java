class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1=String.valueOf(a);
        String a2=String.valueOf(b);
        for(int i=0; i<a2.length();i++){
            a1+=a2.charAt(i);
        }
        int a3 = Integer.parseInt(a1);
        int b1= 2*a*b;
        if(b1>a3) answer = b1;
        else if(a3>b1 || a3==b1) answer=a3;
        return answer;
    }
}