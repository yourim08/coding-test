def solution(my_string, n):
    answer = ''
    m = 0
    for i in range(len(my_string)) :
        for j in range(n) :
            answer += my_string[i]
    return answer