class Solution {
    public String solution(String s) {
        String parts[] = s.split(" ");
        int max = -100000;
        int min = 100000;
        for(int i=0; i<parts.length ; i++){
            if(Integer.parseInt(parts[i])>max){
                max=Integer.parseInt(parts[i]);
            }
            if(Integer.parseInt(parts[i])<min){
                min=Integer.parseInt(parts[i]);
            }
        }
        String answer = String.valueOf(min)+" "+String.valueOf(max);
        return answer;
    }
}