class Solution {
    public int[] solution(String myString) {
        if(myString.charAt(myString.length()-1)=='x') {
            myString+=' ';
        }
        String parts[] = myString.split("x");
        int[] answer = new int[parts.length];
        for(int i=0; i<answer.length ; i++){
            if(parts[i].equals(" ")){
                answer[i]=0;
            }
            else {
            answer[i]=parts[i].length();
            }
        }
        return answer;
    }
}