def solution(numbers, n):
    answer = 0
    sum1 = 0
    for i in range(len(numbers)):
        if sum1>n:
            answer=sum1
            break
        else:
            sum1+=numbers[i]
            answer=sum1
    return answer