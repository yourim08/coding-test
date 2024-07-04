class Solution {
    public int[] solution(int[] numbers) {
        int a[] = new int[numbers.length];
        for(int i=0 ; i<numbers.length;i++){
            a[i]=numbers[i]*2;
        }
        int[] answer = a;
        return answer;
    }
}