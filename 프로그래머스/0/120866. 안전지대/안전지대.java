class Solution {

    public int solution(int[][] board) {
        int[][] board1 = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            board1[i] = board[i].clone();
        }
        int b_i = board.length;
        int b_j = board[0].length;
        int answer = 0;
        if(board.length == 1){
            if(board[0][0] == 1){
                return 0;
            }
            else return 1;
        }
        else {
		    for(int i=0; i<board.length; i++){
			    for(int j=0; j<board[i].length; j++){
				    if(board[i][j] == 1){
					    // 다음
					    if(checkJ((j+1), b_i, b_j)){
						    board1[i][j+1]=1;
					    }     
				    	// 하나 전
					    if(checkJ((j-1), b_i, b_j)){
						    board1[i][j-1]=1;
					    } 
					    // 다음 하나 위
					    if(checkJ((j+1), b_i, b_j) && checkI((i+1), b_i, b_j)){
						    board1[i+1][j+1]=1;
					    }
					    // 다음 하나 아래
					    if(checkJ((j+1), b_i, b_j) && checkI((i-1), b_i, b_j)){
						    board1[i-1][j+1]=1;
					    }
					    // 이전 하나 위
					    if(checkJ((j-1), b_i, b_j) && checkI((i+1), b_i, b_j)){
					    	board1[i+1][j-1]=1;
					    }
					    // 이전 하나 아래
					    if(checkJ((j-1), b_i, b_j) && checkI((i-1), b_i, b_j)){
						    board1[i-1][j-1]=1;
					    }
					    // 바로 위
					    if(checkI((i+1), b_i, b_j)){
						    board1[i+1][j]=1;
					    }
					    // 바로 아래
					    if(checkI((i-1), b_i, b_j)){
					    	board1[i-1][j]=1;
					    }
				    }
			    }
		    }
        
            for(int i=0; i<board1.length; i++) {
			    for(int j =0 ; j<board1[i].length; j++) {
				    if(board1[i][j] == 0) {
					    answer++;
				    }
		    	}
		    }
            return answer;
        }
    }
    
	public static boolean checkI(int x, int b_i, int b_j){
		if(x>=b_i || x<0){
			return false;
		}
		else return true;
	}

	public static boolean checkJ(int y, int b_i, int b_j){
		if(y>=b_j || y<0){
			return false;
		}
		else return true;
	}
}