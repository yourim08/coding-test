def solution(chicken):
    answer = 0
    coupoun = chicken
    while True:
        if coupoun<10:
            break
        answer+=int(coupoun/10)
        coupoun=coupoun%10+int(coupoun/10)
    return answer