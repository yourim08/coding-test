function solution(n) {
    var answer = 0;
    var i=1;
    while(true){
        if(n%i==1) break;
        i++;
    }
    answer=i;
    return answer;
}