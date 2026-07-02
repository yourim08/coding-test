def solution(a, b):
    answer = int(str(a) + str(b))
    n1 = int(str(b) + str(a))
    if n1 > answer : answer=n1
    return answer