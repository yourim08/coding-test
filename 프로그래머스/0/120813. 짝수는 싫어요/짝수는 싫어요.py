def solution(n):
    answer = []
    count = 0
    for i in range(1, n+1):
        if i%2!=0 :
            answer.append(i);        
    return answer