def solution(myString, pat):
    answer = 0
    if myString.upper().find(pat.upper()) != -1 :
        answer=1
    return answer