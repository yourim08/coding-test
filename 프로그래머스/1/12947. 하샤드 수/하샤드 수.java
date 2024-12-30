class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String x1 = String.valueOf(x);
        int sum=0;
        for(int i=0; i<x1.length(); i++){
            sum+=Character.getNumericValue(x1.charAt(i));
        }
        if(x%sum!=0) answer=false;
        return answer;
    }
}