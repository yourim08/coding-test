class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus=0;
        int mul=1;
        for(int i=0; i<num_list.length;i++){
            if(num_list.length >=11) {
                plus+=num_list[i];
                answer=plus;
            }
            if(num_list.length <=10) {
                mul*=num_list[i];
                answer=mul;
            }
        }
        return answer;
    }
}