def solution(n):
    answer = 2
    i = 1
    while True:
        if i>=n:
            break
        if n==i*i:
            answer = 1
            break
        i = i+1
    return answer