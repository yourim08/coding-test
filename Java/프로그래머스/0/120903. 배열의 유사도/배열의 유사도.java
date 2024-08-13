class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer=0;
        int count=0;
        for(int i=0; i<s2.length ;i++){
            for(int j=0; j<s1.length ;j++){
            if(s2[i].equals(s1[j])) {
            count++;
                }
            }
        }
        answer=count;
        return answer;
    }
}