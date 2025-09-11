def solution(keyinput, board):
    answer = [0,0]
    for i in range(len(keyinput)):
        if keyinput[i] == "left":
            if answer[0]-1>=-(board[0]/2):
                answer[0]-=1
        elif keyinput[i] == "right":
            if answer[0]+1<=(board[0]/2):
                answer[0]+=1
        elif keyinput[i] == "up":
            if answer[1]+1<=(board[1]/2):
                answer[1]+=1
        elif keyinput[i] == "down":
            if answer[1]-1>=-(board[1]/2):
                answer[1]-=1
    return answer