def solution(money):
    answer = []
    i = 1
    while True:
        if 5500*i>money:
            i-=1
            break
        i+=1
    answer.append(i)
    answer.append(money-5500*i)
    return answer