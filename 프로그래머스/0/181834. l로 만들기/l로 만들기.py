def solution(myString):
    answer = myString
    for i in range(len(answer)):
        if answer[i]<"l": 
            answer = answer.replace(answer[i], "l")
    return answer