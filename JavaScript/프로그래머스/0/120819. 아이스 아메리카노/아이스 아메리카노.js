function solution(money) {
    var answer = new Array(2);
    var i=1;
    while(true){
        if(5500*i>money){
            i= i-1;
            break;
        }
        i++;
    }
    answer[0]=i;
    answer[1]=money-5500*i;
    return answer;
}