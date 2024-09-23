class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max=0;
        int max1=0;
        for(int i=0 ; i<strArr.length;i++){
            if(strArr[i].length()>max) max=strArr[i].length();
        }
        int count[]=new int[max];
        for(int i=0 ; i<strArr.length;i++){
            count[strArr[i].length()-1]++;
        }
        for(int i=0; i<count.length;i++){
            if(count[i]>max1) max1=count[i]; 
        }
        answer=max1;
        return answer;
    }
}