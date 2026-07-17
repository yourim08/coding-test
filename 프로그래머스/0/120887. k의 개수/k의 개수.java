class Solution {
    public int solution(int i, int j, int k) { 
        int answer=0; 
        int a=0; 
        String n=String.valueOf(i);
        char k1=(char)(k+48);     
        for(int m=i; m<=j; m++){   
            n=String.valueOf(m);
            for(int l=0; l<n.length(); l++){
                if(n.charAt(l)==k1) answer++;
            }
        }
        return answer;
    }
}