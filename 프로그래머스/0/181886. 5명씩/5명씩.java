class Solution {
    public String[] solution(String[] names) {
        int n = 0;
        int len = 0;
        if(names.length%5 == 0){
            len = names.length/5;
        }
        else {
            len = names.length/5+1;
        }
        String[] answer = new String[len];
        for(int i=0; i<names.length; i++){
            if(i%5==0){
            answer[n]=names[i];
            n++;
            }
        }
        return answer;
    }
}