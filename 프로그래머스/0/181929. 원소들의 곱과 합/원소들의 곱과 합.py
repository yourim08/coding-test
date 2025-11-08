def solution(num_list):
    answer = 0
    mul=1
    sum=0
    for i in num_list:
        mul*=i
        sum+=i
    if mul<sum*sum:
        answer=1
    return answer