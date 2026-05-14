class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 1;    
        int zeroCount = 0;   

        while(true){
            // 0 제거 
            int originLength = s.length();
            int newLength = s.replace("0", "").length();
            zeroCount += originLength - newLength;

            // 이진 변환
            String newString = Integer.toBinaryString(newLength);
            if(newString.equals("1")){
                answer[0] = count;
                answer[1] = zeroCount;
                break;
            }
            else {
                s = newString;
            }
            count++;
        }
        return answer;
    }
}