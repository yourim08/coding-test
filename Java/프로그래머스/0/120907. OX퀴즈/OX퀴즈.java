class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int n=0;
        for(int i=0; i<quiz.length ; i++){
            String parts[] = quiz[i].split(" ");
            int result=0;
            if(parts[1].equals("+")){
                result = Integer.parseInt(parts[0])+Integer.parseInt(parts[2]);
                if(result==Integer.parseInt(parts[4])){
                    answer[n]="O";
                    n++;
                }
                else {
                    answer[n]="X";
                    n++;
                }
            }
            else if(parts[1].equals("-")){
                result = Integer.parseInt(parts[0])-Integer.parseInt(parts[2]);
                if(result==Integer.parseInt(parts[4])){
                    answer[n]="O";
                    n++;
                }
                else {
                    answer[n]="X";
                    n++;
                }
            }            
        }
        return answer;
    }
}