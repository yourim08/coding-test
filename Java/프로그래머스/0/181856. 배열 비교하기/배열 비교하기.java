class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int asum=0;
        int bsum=0;
        if(arr1.length>arr2.length) answer=1;
        else if(arr1.length<arr2.length) answer=-1;
        else {
            for(int a : arr1){
                asum+=a;
            }
            for(int b : arr2){
                bsum+=b;
            }
            if(asum>bsum) answer=1;
            else if(asum<bsum) answer=-1;
            else answer=0;
        }
        return answer;
    }
}