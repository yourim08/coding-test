class Solution {
    public int solution(int a, int b) {
		String c = " ";
		String c1 = " ";
		String s = String.valueOf(a);   
		String s1 = String.valueOf(b);
		c = s + s1;
		c1 = s1 + s;
		int an = Integer.parseInt(c);
		int swer = Integer.parseInt(c1);
		int answer = an;
		
		if(an < swer) {
			answer = swer;
		}
        return answer;
    }
}