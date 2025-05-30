function solution(board, moves) {
            let answer = 0;
            let stack = [];
            let input;
            for (let x of moves){
                // 인형 집기
                for(let i=0; i<board.length; i++){
                    if(board[i][x-1] != 0){
                        input = board[i][x-1]; 
                        board[i][x-1] = 0;
                        // 터트리기
                        if(stack[stack.length-1] == input){
                            answer+=2;
                            stack.pop();
                        }
                        else {
                            stack.push(input);
                        }
                        break;
                    }
                }  
            }
            return answer;
    return answer;
}