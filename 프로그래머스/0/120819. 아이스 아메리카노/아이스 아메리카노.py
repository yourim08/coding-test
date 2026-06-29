def solution(money):
    answer = []
    n = int(money / 5500)
    m = money - (n*5500)
    answer.append(n)
    answer.append(m)
    return answer