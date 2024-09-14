class Solution {
    public String solution(String letter) {
        String parts[] = letter.split(" ");
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int index=0;
        String answer = "";
        for(int i=0; i<parts.length;i++){
            for(int j=0; j<morse.length ; j++){
                if(parts[i].equals(morse[j])){
                    answer+=(char)(97+j);
                }
            }
        }
        return answer;
    }
}