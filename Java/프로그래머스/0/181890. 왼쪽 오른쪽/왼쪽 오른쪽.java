class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = new String[0];
        int index = 0;
        int count = 0;
        int count1 = 0;
        int n = 0;
        int m = 0;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                index = i;
                // 베열 길이 게산
                for(int j=0; j<index; j++){
                    count++;
                }
                answer = new String[count];
                // 값 넣기
                for(int k=0; k<index; k++){
                    answer[n]=str_list[k];
                    n++;
                }
                break;
            }
            else if(str_list[i].equals("r")){
                index = i;
                // 베열 길이 게산
                for(int j=i; j<str_list.length; j++){
                    count1++;
                }
                answer = new String[count1-1];
                // 값 넣기
                for(int k=i+1; k<str_list.length; k++){
                    answer[m]=str_list[k];
                    m++;
                }
                break;
            }
            else {
                answer = new String[0];
            }
        }
        return answer;
    }
}