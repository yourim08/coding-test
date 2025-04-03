def solution(n):
    answer = 0
    m = 1
    k = 1
    j = 2
    while True:
        k*=j
        if k>n:
            answer = j-1
            break
        else: j=j+1
    return answer