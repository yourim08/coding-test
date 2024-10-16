class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] board = new int[2000];
        int n=0;
        int m=0;
        int count=0;
        // 100개의 board 배열에 값 설정
        for(int i=0; i<flag.length;i++){
            if(flag[i]==true){
                for(int j=0; j<arr[i]*2;j++){
                    if(n<2000){
                        board[n]=arr[i];
                        n++; // n=6
                    }
                }
            }
            else {
                for(int k=0; k<arr[i];k++){
                    if(n-1>=0){
                        board[n-1]=0;
                        n--;
                    }
                }
            }
        }
        // answer배열에 값 넣기
        for(int i=0; i<board.length ; i++){
            if(board[i]!=0){
                count++;
            }
        }
        int answer[] = new int[count];
        for(int i=0; i<board.length ; i++){
            if(board[i]!=0){
                answer[m]=board[i];
                m++;
            }
        }
        return answer;
    }
}