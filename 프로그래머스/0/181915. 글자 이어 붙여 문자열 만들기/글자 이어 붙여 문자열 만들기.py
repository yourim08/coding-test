def solution(my_string, index_list):
    answer = '' 
    for s in index_list:
        answer+=my_string[s]
    return answer