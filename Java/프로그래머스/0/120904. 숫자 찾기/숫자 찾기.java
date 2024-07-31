class Solution {
    public int solution(int num, int k) {
        int result=-1;
        String numStr = Integer.toString(num);
        int[] numArray = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            numArray[i] = Character.getNumericValue(numStr.charAt(i));
        }
        for(int i=0 ; i<numArray.length ; i++){
            if(numArray[i]==k){
                result=i+1;
                break;}
        }
        int answer = result;
        return answer;
    }
}