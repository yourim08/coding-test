class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count=0;
        for(int i=0; i<finished.length ; i++){
            if(finished[i]) {
                continue;
            } 
            else {
                count++;
            }
        }
        String[] answer = new String[count];
        int n=0;
        for(int i=0; i<todo_list.length;i++){
            if(finished[i]) {
                continue;
            }
            else {
                answer[n]=todo_list[i];
                n++;
            }
        }
        return answer;
    }
}