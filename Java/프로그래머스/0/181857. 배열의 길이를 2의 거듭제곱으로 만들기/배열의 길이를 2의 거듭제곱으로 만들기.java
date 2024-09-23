class Solution {
    public int[] solution(int[] arr) {
        int i=1;
        while(true){
            if(i>=arr.length) break;
            else i*=2;
        }   
        int[] answer = new int[i];
        for(int j=0; j<arr.length; j++){
            answer[j]=arr[j];
        }
        return answer;
    }
}