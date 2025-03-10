def solution(n):
    answer = 0
    oddanswer = 0
    evenanswer = 0
    if (n%2!=0) :
        for i in range(n+1):
            if(i%2!=0) :
                oddanswer += i
        
        answer = oddanswer
    else :
        for i in range(n+1):
            if(i%2==0) :
                evenanswer+= i*i
        
        answer = evenanswer
    return answer