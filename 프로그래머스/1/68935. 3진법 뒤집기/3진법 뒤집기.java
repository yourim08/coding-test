class Solution {
    public int solution(int n) {
        StringBuffer str = new StringBuffer(Integer.toString(n, 3));
        int answer = Integer.parseInt((str.reverse().toString()),3);
        return answer;
    }
}