class Solution {
    public String[] solution(String my_string) {
        String[] sp = my_string.split("\\s+");
        int count=0;
        int n=0;
        for(int i=0 ; i<sp.length;i++){
            if(!sp[i].equals("")) count++;
        }
        String answer[]=new String[count];
        for(int i=0; i<sp.length;i++){
            if(!sp[i].equals("")) {
                answer[n]=sp[i];
                n++;
                }
        }
        return answer;
    }
}