def solution(my_string):
    answer = ''
    for i in range(len(my_string)):
        if(my_string[i] != 'a' and my_string[i] != 'o' and my_string[i] != 'i' 
           and my_string[i] != 'u' and my_string[i] != 'e'):
            answer += my_string[i];
    return answer