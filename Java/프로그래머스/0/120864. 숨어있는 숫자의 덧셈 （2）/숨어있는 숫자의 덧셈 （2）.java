class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String parts[] = my_string.split("[A-z]+");
        for(int i=0; i<parts.length; i++){
            if(!parts[i].equals("")) answer+= Integer.parseInt(parts[i]);               
        }
        return answer;
    }
}