def solution(number):
    answer = 0;
    for x in number:
        answer += int(x)
    answer = answer%9
    return answer