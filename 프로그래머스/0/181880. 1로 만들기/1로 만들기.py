def solution(num_list):
    answer = 0
    n=0
    for i in range(len(num_list)):
        n=num_list[i]
        while True:
            if n==1: break
            if n%2==0:
                n=int(n/2)
                answer+=1
            else:
                n=int((n-1)/2)
                answer+=1
    return answer