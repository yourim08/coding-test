import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count=0;
        int temp[];
        while(true){
            temp=arr.clone();
            for(int i=0; i<arr.length; i++){
                // 50 미만 홀수
                if(arr[i]<50 && arr[i]%2!=0){
                    arr[i]=arr[i]*2+1;
                }
                // 50 이상 짝수
                else if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]=arr[i]/2;
                }
            }
            count++;
            // ==쓰면 주소가 같기 때문에 항상 같음
            if(Arrays.equals(temp, arr)){
                answer = count-1;
                break;
            }
        }
        return answer;
    }
}