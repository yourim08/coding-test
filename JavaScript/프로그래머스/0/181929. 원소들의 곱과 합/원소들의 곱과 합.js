function solution(num_list) {
    var answer = 0;
    var mul=1;
    var sum=0;
    for(var i of num_list) {
        mul*=i;
        sum+=i;
    }
    if(mul<sum*sum) answer=1;
    return answer;
}