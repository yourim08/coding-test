def solution(n):
    answer = 1
    former = 0
    m = 1
    for i in range(n-1):
        answer = (m+former) % 1234567    
        former = m
        m = answer
    return answer