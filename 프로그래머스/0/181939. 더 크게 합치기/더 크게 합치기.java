class Solution {
    public int solution(int a, int b) {
        String ab = " ";
        String ba = " ";        
        String a1 = String.valueOf(a); // a 를 변환
        String b1 = String.valueOf(b); // b 를 변환
        
        ab = a1 + b1;
        ba = b1 + a1;
        
        int answer1 = Integer.parseInt(ab);
        int answer2 = Integer.parseInt(ba);
        int answer = answer1;
    
        if (answer1<answer2) {
            answer = answer2;
        }
        return answer;
    }
}