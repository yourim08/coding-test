class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int arr[] = new int[included.length];
        arr[0]=a;
        for(int i=1; i<arr.length ; i++){
            a+=d;
            arr[i]=a;
        }
        for(int i=0; i<included.length ; i++){
            if(included[i]){
                answer+=arr[i];
            }
        }
        return answer;
    }
}