class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String number = "";
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            number+=phone_number.charAt(i);
        }
        for(int i=0; i<phone_number.length()-4; i++){
            answer+='*';
        }
        answer=answer+number;
        return answer;
    }
}