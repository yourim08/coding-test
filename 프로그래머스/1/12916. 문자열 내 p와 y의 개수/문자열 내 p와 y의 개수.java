class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'P' || s.charAt(i)== 'p'){
                count1++;
            }
            else if(s.charAt(i) == 'Y' || s.charAt(i)== 'y'){
                count2++;
            }
        }
        if(count1 == count2) {
            return true;
        }
        return answer;
    }
}