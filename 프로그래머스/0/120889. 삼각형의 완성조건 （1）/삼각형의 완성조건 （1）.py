def solution(sides):
    answer = 2
    sum = 0
    max = 0
    count = 0
    for i in range(len(sides)):
        if sides[i]>max :
            max=sides[i]
    for i in range(len(sides)):
        if sides[i]==max: 
            count = count+1;
    for i in range(len(sides)):
        if sides[i]!=max and count==1:
            sum+=sides[i]
        if sides[i]<=max and count>1: 
            sum+=sides[i]           
    if sum>max:
        answer=1
    return answer