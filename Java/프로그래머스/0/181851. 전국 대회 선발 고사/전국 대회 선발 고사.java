class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int max1=rank.length+1;
        int max2=rank.length+1;
        int max3=rank.length+1;
        int a=0;
        int b=0; 
        int c=0;
        for(int i=0; i<rank.length ; i++){
            if(attendance[i]){
                if(rank[i]<max1){
                    max1=rank[i]; 
                    a=i;
                }
            }
        }
        for(int i=0; i<rank.length ; i++){
            if(attendance[i]){
                if(rank[i]<max2 && rank[i]!=max1){
                    max2=rank[i];  
                    b=i;
                }
            }
        }
        for(int i=0; i<rank.length ; i++){
            if(attendance[i]){
                if(rank[i]<max3 && rank[i]!=max1 && rank[i]!=max2){
                    max3=rank[i];  
                    c=i;
                }
            }  
        }
        answer=10000*a+100*b+c;
        return answer;
    }
}