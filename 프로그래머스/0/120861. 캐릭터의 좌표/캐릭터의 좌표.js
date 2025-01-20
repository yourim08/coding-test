function solution(keyinput, board) {
    var answer = new Array(2);
    answer[0] = 0;
    answer[1] = 0;
    for(let i=0; i<keyinput.length ; i++){
        if(keyinput[i] == "left"){
            if(answer[0]-1>=-(board[0]/2)){
                answer[0]-=1;
            }
        }
        else if(keyinput[i] == "right"){
            if(answer[0]+1<=(board[0]/2)){
                answer[0]+=1;
            }
        }
        else if(keyinput[i] == "up"){
            if(answer[1]+1<=(board[1]/2)){
                answer[1]+=1;
            }
        }
        else if(keyinput[i] == "down"){
            if(answer[1]-1>=-(board[1]/2)){
                answer[1]-=1;
            }
        }
    }
    return answer;
}