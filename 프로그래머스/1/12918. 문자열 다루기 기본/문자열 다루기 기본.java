class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) >= 65 && s.charAt(i) <=90 ){
                    return false;
                }
                if(s.charAt(i) >= 97 && s.charAt(i) <=122){
                    return false;
                }
            }
        }
        else {
            return false;
        }
        return answer;
    }
}