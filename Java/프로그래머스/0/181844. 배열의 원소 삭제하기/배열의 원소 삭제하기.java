class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int same=0;
        int n=0;
        
        for(int i=0; i<delete_list.length ;i++){
            for(int j=0; j<arr.length;j++){
                if(delete_list[i]==arr[j]) same++;
            }
        }
          int[] answer = new int[arr.length-same];
        for(int i=0; i<arr.length ;i++){
            int count=0;
            for(int j=0; j<delete_list.length;j++){
                if(arr[i]!=delete_list[j]){
                    count++;
                }
                if(count==delete_list.length) {
                    answer[n]=arr[i];
                    n++;
                }
            }
        }
        return answer;
    }
}