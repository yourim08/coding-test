class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String result="";
        String answer1="";
        char ch[]=numbers.toCharArray();
        int i=0;
        while(i<ch.length){    
            result+=ch[i];
            i++;
            if(result.equals("zero")) {
                answer1+="0";
                result="";
            }
            else if(result.equals("one")) {
                answer1+="1";
                result="";
            }
            else if(result.equals("two")) {
                answer1+="2";
                result="";
            }
            else if(result.equals("three")) {
                answer1+="3";
                result="";
            }
            else if(result.equals("four")) {
                answer1+="4";
                result="";
            }
            else if(result.equals("five")) {
                answer1+="5";
                result="";
            }
            else if(result.equals("six")) {
                answer1+="6";
                result="";
            }
            else if(result.equals("seven")) {
                answer1+="7";
                result="";
            }
            else if(result.equals("eight")) {
                answer1+="8";
                result="";
            }
            else if(result.equals("nine")) {
                answer1+="9";
                result="";
                }
        }
        answer=Long.parseLong(answer1);
        return answer;
    }
}