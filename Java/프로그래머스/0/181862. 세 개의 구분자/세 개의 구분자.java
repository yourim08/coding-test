class Solution {
    public String[] solution(String myStr) {
        String[] parts = myStr.split("a|b|c");
        String answer[];
        int count=0;
        int n=0;
        if(parts.length==0){
            answer= new String[1];
            answer[0]="EMPTY";
        } 
        else {
            for(int i=0; i<parts.length ; i++){
                if(!parts[i].equals(""))
                    count++;
            }
            answer=new String[count];
            for(int i=0; i<parts.length ; i++){
                if(!parts[i].equals("")){
                    answer[n]=parts[i];
                    n++;
                }
            }
        }
        return answer;
    }
}