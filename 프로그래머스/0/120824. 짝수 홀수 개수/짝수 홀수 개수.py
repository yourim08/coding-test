def solution(num_list):
    answer = []
    oddcount=0
    evencount=0
    for i in range(len(num_list)):
            if num_list[i]%2==0: evencount+=1
            else: oddcount+=1
    answer = [evencount, oddcount]
    return answer