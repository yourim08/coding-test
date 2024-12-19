function solution(n) {
    var answer = 0;
    var count =0;
    for(var i=1; i<=n ;i++){
        if(n%i==0) count++;
    }
    answer=count;    
    return answer;
}