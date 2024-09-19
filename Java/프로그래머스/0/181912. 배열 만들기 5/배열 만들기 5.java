class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int count=0;
        int n=0;
        String cut[] = new String[intStrs.length];
        for(int i=0; i<cut.length; i++){
            cut[i]="";
        }
        for(int i=0; i<intStrs.length;i++){
            for(int j=s ; j<l+s ; j++){
                char ch[] = intStrs[i].toCharArray();
                cut[i]+=ch[j];
                if(Integer.parseInt(cut[i])>k){
                    count++;
                }
            }
        }
        int answer[] = new int[count];
        for(int i=0; i<cut.length ; i++){
           if(Integer.parseInt(cut[i])>k){
               answer[n]=Integer.parseInt(cut[i]);
               n++;
           }
        }
        return answer;
    }
}