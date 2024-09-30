function solution(n) {
    var answer = 0;
    var i=1;
    var flag=0;
    while(true){
        if(7*i>=n){
            flag=i;
            break;
        }
        else {
            i++;
        }
    }
    answer=flag;
    return answer;
}