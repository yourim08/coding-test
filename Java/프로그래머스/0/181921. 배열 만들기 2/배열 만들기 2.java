class Solution {
    public int[] solution(int l, int r) {
        int count=0;
        for(int i=l; i<=r; i++){
            int flag=0;
            String str = String.valueOf(i);
            for(int j=0; j<str.length();j++){
                if(str.charAt(j)=='5' || str.charAt(j)=='0'){
                    flag=1;
                }
                else {
                    flag=0;
                    break;
                }
            }
            if (flag==1) {
                count++;
            }
        }
        // 값 넣기
        if(count==0) {
            int answer[] = {-1};
            return answer;
        }
        else {
            int answer[]=new int[count];
            int n=0;
            for(int i=l; i<=r; i++){
                int flag1=0;
                String str1 = String.valueOf(i);
                for(int j=0; j<str1.length();j++){
                    if(str1.charAt(j)=='5' || str1.charAt(j)=='0'){
                        flag1=1;
                    }
                    else {
                        flag1=0;
                        break;
                    }
                }
                if (flag1==1) {
                    answer[n]=i;
                    n++;
                }
            }
        return answer;
        }
    }
}