function solution(a, b) {
    var answer = 0;
    if(a%2!=0 && b%2!=0) {
        answer=a*a+b*b;
    }
    else if(a%2!=0 || b%2!=0) {
        answer=2*(a+b);
    }
    else {
        if((a-b)<0) answer = -(a-b);
        else answer= a-b;
    }
    return answer;
}