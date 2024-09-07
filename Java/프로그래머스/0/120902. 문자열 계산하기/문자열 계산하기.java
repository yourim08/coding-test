class Solution {
    public int solution(String my_string) {
        String part[] = my_string.split(" ");
        int first=Integer.parseInt(part[0]); // 3
        for(int i=1; i<part.length ; i+=2){
            if(part[i].equals("+")) first+=Integer.parseInt(part[i+1]);
            if(part[i].equals("-")) first-=Integer.parseInt(part[i+1]);
        }
        int answer = first;
        return answer;
    }
}