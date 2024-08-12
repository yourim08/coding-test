class Solution {
    public int solution(String my_string) {
        char ch[] = my_string.toCharArray();
        int answer = 0;
        for(int i=0; i<ch.length ;i++){
            if(ch[i]>=48 && ch[i]<=57)
                answer+=Character.getNumericValue(ch[i]);
        }
        return answer;
    }
}