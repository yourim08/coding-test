def solution(my_str, n):
    arr = list(my_str)
    m = 0
    for i in range(1, len(my_str)):
        if i%n ==0:
            arr.insert(i+m, '+')
            m+=1
    answer = (''.join(arr)).split('+')
    return answer