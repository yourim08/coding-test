def solution(num_list, n):
    count1 = 0
    m = 0
    while True:
        if m*n < len(num_list):
            count1 = count1+1
            m = m+1
        else: break
    answer = [0] * count1
    count=0
    for i in range(len(answer)):
        answer[i]=num_list[count]
        count+=n;
    return answer