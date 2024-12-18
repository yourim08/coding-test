function solution(n) {
    var answer = 0;
    var i=1;
    while(true){
        if((6*i)%n==0) {
            answer=i;
            break;
        }
        else i++;
    }
    return answer;
}