function solution(start_num, end_num) {
    var answer = new Array(end_num-start_num+1);
    var n=0;
    for(var i=start_num; i<=end_num; i++){
        answer[n]= i;
        n++;
    }
    return answer;
}