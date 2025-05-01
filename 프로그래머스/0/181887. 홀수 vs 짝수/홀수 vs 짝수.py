def solution(num_list):
    answer = 0
    oddsum = 0;
    evensum = 0;
    for i in range(len(num_list)):
        if i%2==0: oddsum+=num_list[i]
        else: evensum+=num_list[i]
        if oddsum>evensum: answer=oddsum
        else: answer=evensum
    return answer