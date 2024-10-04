class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double c01 = cal(dots[0],dots[1]);
        double c02 = cal(dots[0],dots[2]);
        double c03 = cal(dots[0],dots[3]);
        double c12 = cal(dots[1],dots[2]);
        double c13 = cal(dots[1],dots[3]);
        double c23 = cal(dots[2],dots[3]);
        if(c01 == c23) answer=1;
        if(c02 == c13) answer=1;
        if(c03 == c12) answer=1;
        return answer;
    }
    // 두 점을 이은 기울기 계산
    private double cal(int[] point1, int[] point2) {
        if (point1[0] == point2[0]) {
            return Double.POSITIVE_INFINITY; // 수직선
        }
        if (point1[1] == point2[1]) {
            return 0; // 수평선
        }
        return (double)(point2[1] - point1[1]) / (double)(point2[0] - point1[0]); 
        // 일반적인 기울기
    }
}