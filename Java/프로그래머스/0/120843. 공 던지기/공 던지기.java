class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int sum=0;
        int index=0;
        for(int i=0 ; i<k; i++){
            sum+=2;
        }
        int arr[] = new int[sum];
        for(int i=0; i<arr.length ; i++){
            arr[i]=numbers[i%numbers.length];
        }
        for(int i=0; i<k-1; i++){
            index+=2;
        }
        answer = arr[index];
        return answer;
    }
}