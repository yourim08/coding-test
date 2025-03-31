def solution(slice, n):
    answer = 0
    i = 1
    while True :
        if slice*i>=n: 
            answer=i
            break
        else: i+=1
    return answer