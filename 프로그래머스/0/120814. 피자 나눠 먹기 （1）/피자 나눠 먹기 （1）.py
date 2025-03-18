def solution(n):
    answer = 0
    seven = int(n/7)
    if (n%7==0) :
        answer=seven
    else :
        answer=seven+1
    return answer