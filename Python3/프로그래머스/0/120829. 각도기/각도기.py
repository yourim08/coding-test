def solution(angle):
    answer = 0
    if 0 < angle < 90 : answer=1;
    if 90 < angle < 180 : answer=3;
    if angle==90 : answer=2;
    if angle==180 : answer=4;
    return answer