class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd ="";
        for(int i=0; i<num_list.length;i++){
            if(num_list[i]%2==0) {
                odd+=String.valueOf(num_list[i]);   
            }
            else {
                even+=String.valueOf(num_list[i]);   
            }
        }
        answer = (Integer.parseInt(odd))+(Integer.parseInt(even));
        return answer;
    }
} 