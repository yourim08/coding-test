class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        if(x1==true || x2==true) flag1 = true;
        else flag1 = false;
        if(x3==true || x4==true) flag2 = true;
        else flag2 = false;
        if(flag1==false || flag2==false) answer=false;
        return answer;
    }
}