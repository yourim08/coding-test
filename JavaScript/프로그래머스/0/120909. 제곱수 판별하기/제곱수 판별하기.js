function solution(n) {
    var answer = 2;
    var i=1;
    while(true){
        if(i>=n) break;
        if(n==i*i){
            answer=1;
            break;
        }
        i++;
    }
    return answer;
}