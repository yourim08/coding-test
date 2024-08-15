class Solution {
    public int solution(int order) {
        int answer = 0;
        int count=0;
        String str = Integer.toString(order);
        char ch[] = str.toCharArray();
        for(int i=0; i<ch.length;i++){
            if(ch[i]=='3' ||ch[i]=='6'||ch[i]=='9') count++;
        }
        answer=count;
        return answer;
    }
}