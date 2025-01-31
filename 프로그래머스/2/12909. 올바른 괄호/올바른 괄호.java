class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '('){
            return false;
        }
        else {
            for(int i=0; i<s.length(); i++){
                if(count<0){
                    return false;
                }
                if(s.charAt(i) == '('){
                    count+=1;
                }
                else {
                    count-=1;
                }
            }
            if(count != 0){
                return false;
            }
        }
        return answer;
    }
}